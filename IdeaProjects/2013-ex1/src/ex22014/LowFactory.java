package ex22014;

public class LowFactory extends AbstractFactory {
    @Override
    public Printer createPrinter() {
        return new PrinterLowRes();
    }

    @Override
    public Visualizer createVisualizer() {
        return new VisualizerLowRes();
    }
}
