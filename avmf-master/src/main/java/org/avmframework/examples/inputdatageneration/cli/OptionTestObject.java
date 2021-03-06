package org.avmframework.examples.inputdatageneration.cli;

import org.avmframework.Vector;
import org.avmframework.examples.inputdatageneration.*;
import org.avmframework.examples.inputdatageneration.line.LineBranchTargetObjectiveFunction;
import org.avmframework.variable.FixedPointVariable;

public class OptionTestObject extends TestObject  {
	
	static final int NUM_BRANCHING_NODES = 7;

    static final int PRECISION = 1;
    static final double INITIAL_VALUE = 0.0, MIN = 0.0, MAX = 100.0;
    
	@Override
    public Vector getVector() {
        Vector vector = new Vector();
        for (int i=0; i < 8; i++) {
            vector.addVariable(new FixedPointVariable(INITIAL_VALUE, PRECISION, MIN, MAX));
        }
        return vector;
    }
	
	@Override
    public BranchTargetObjectiveFunction getObjectiveFunction(Branch target) {
        return new LineBranchTargetObjectiveFunction(target);
    }

    @Override
    public int getNumBranchingNodes() {
        return NUM_BRANCHING_NODES;
    }
	
}