package ex22016;

public interface Visitor {
    void visit(Leaf f);
    void visit(Composite cs);
}
