package recu2017;


public class MeanLength extends SequenceProcessor{
    @Override
    protected void processElement(Object element) {
        mean = element.toString().length();
    }
}
