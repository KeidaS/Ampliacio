package ex32016;

public class FigureBuilder {
    private double x;
    private double y;
    private double width;
    private double height;
    private double radius;
    private boolean atDefined = false;
    private boolean rectangleDefined = false;
    private boolean circleDefined = false;

    public FigureBuilder at(double x, double y) {
        if (!atDefined)  {
            this.x = x;
            this.y = y;
        }
        return this;
    }
    public FigureBuilder withDimensions(double width, double height) {
        this.width = width;
        this.height = height;
        rectangleDefined = true;
        return this;
    }
    public FigureBuilder withRadius(double radius) {
        this.radius = radius;
        circleDefined = true;
        return this;
    }
    public Figure execute() {
        if (circleDefined && atDefined && !rectangleDefined) {
            return new Circle(x, y, radius);
        } else if (rectangleDefined && atDefined && !circleDefined) {
            return new Rectangle(x, y, width, height);
        } else {
            throw new IllegalStateException("Error");
        }
    }
}
