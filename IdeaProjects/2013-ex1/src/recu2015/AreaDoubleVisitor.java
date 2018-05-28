package recu2015;

/**
 * Created by anb1 on 28/05/18.
 */
import com.sun.javafx.UnmodifiableArrayList;

import java.math.*;
public class AreaDoubleVisitor implements Visitor {
    private Circle circle;
    private Rectangle rectangle;
    private Drawing drawing;

    @Override
    public void visit(Rectangle r) {
        this.rectangle = new Rectangle(r.getX(), r.getY(),
                r.getHeight() * Math.sqrt(2.0),
                r.getWidth() * Math.sqrt(2.0));
    }

    @Override
    public void visit(Circle c) {
        double doubleRadius = c.getR();
        doubleRadius = Math.sqrt(2.0);
        this.circle  = new Circle(c.getX(), c.getY(), c.getR() * Math.sqrt(2.0));
    }

    @Override
    public void visit(Drawing d) {
        for (Figure f: d.getComponents()){
            f.accept(this);
        }
    }
}
