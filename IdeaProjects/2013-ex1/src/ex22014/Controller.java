package ex22014;

public class Controller {
    public enum Resolution{HI, LOW}
    Resolution resolution;
    private Document document;
    private AbstractFactory factory;


    public Controller (Resolution resolution, Document document) {
        this.resolution = resolution;
        this.document = document;
        configureResulation("hi");
    }

    public void configureResulation(String resolution) {
        if(resolution.equals(resolution)) {
            factory = new HighFactory();
        } else {
            factory = new LowFactory();
        }
    }

    public void visualize() {
        factory.createVisualizer().visualize(this.document);
    }
    public void print () {
        factory.createPrinter().print(this.document);
    }
}
