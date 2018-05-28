package recu2015;

/**
 * Created by anb1 on 28/05/18.
 */
public class Circle extends Figure{
    double r;

    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }
    public double getR() {
        return this.r;
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
