package dev.ananda.oopatterns.behavioral.visitor.sample1;

public interface Visitor {
	int visit(Pen pen);
    int visit(Notebook notebook);
}
