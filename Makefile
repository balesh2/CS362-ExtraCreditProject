all: ExtraCredit.tex
	pdflatex ExtraCredit.tex
clean:
	rm -f *.out *.glo *.log *.toc *.ist *.aux
