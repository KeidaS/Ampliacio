package ex22014;

public class Controller {
    public enum Resolution{HI, LOW}
    Resolution resolution;
    private Document document;

    public Controller (Resolution resolution, Document document) {
        this.resolution = resolution;
        this.document = document;
    }
    public void visualize() {
        Visualizer visualizer;
        if (this.resolution == Resolution.HI) {
            visualizer = new VisualizerHiRes();
        } else { //	Resolution.LOW
            visualizer = new VisualizerLowRes();
        }
        visualizer.visualize(this.document);
    }
    public void print () {

    }
}
