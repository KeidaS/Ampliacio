package ex32013;

public abstract class Figure {
    public static FigureBuilder create() {
        return new FigureBuilder();
    }
}
