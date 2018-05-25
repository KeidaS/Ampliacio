package ex22016;

import com.sun.javafx.UnmodifiableArrayList;

public class Composite extends Component {
    private boolean visited = false;
    private UnmodifiableArrayList<Component> components;

    public UnmodifiableArrayList<Component> getComponents () {
        return this.components;
    }

    public void isVisited() {
        visited = true;
    }

    public boolean hasBeenVisited() {
        return this.visited;
    }
    @Override
    public void accept(ex22016.Visitor visitor) {
        visitor.visit(this);
    }
}
