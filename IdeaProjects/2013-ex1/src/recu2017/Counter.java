package recu2017;

public class Counter extends SequenceProcessor {

    @Override
    protected void processElement(Object element) {
        count++;
    }

}
