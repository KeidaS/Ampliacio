package ex22014;

public abstract class ControllerFactory {
    public static Visualizer createVisualizer(Resolution resolution) {
        if (resolution == Controller.Resolution.HI) {
            return new VisualizerHiRes();
        } else {
            return new VisualizerLowRes();
        }
    }

    public static Printer createVisualizer(Resolution resolution) {
        if (resolution == Controller.Resolution.HI) {
            return new PrinterHiRes();
        } else {
            return new PrinterLowRes();
        }
    }
}