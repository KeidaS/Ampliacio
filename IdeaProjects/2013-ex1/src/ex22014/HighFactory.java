package ex22014;

/**
 * Created by anb1 on 28/05/18.
 */
public class HighFactory extends AbstractFactory {

    @Override
    public Printer createPrinter() {
        return new PrinterHiRes();
    }

    @Override
    public Visualizer createVisualizer() {
        return new VisualizerHiRes();
    }
}
