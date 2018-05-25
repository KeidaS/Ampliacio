package ex32016;

public abstract class Figure {

    protected final double x;
    protected final double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static FigureBuilder create() { return new FigureBuilder(); }
}
