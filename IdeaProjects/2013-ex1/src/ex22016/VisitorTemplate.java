package ex22016;

public abstract class VisitorTemplate implements Visitor {
    protected int number;

    protected abstract void operation(Leaf l);

    public void visit(Leaf f) {
        if (!f.hasBeenVisited()) {
            operation(f);
        }
    }

    @Override
    public void visit(Composite composite) {
        if (!composite.hasBeenVisited()){
            for(Component sc : composite.getComponents()){
                sc.accept(this);
            }
        }
    }

    public int getResult() {
        return number;
    }

}
