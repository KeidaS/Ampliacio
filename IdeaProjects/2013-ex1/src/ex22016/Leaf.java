package ex22016;

public class Leaf extends Component{
    private int info = 1;
    private boolean visited = false;

    public int getInfo() {
        return this.info;
    }

    public void isVisited() {
        visited = true;
    }

    public boolean hasBeenVisited() {
        return this.visited;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
