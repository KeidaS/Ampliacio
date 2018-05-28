package recu2015;

/**
 * Created by anb1 on 28/05/18.
 */
public abstract class Figure {
    double x;
    double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }

    public abstract void accept(Visitor visitor);
}
