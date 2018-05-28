package recu2017;

import java.util.Iterator;

public abstract class SequenceProcessor<E> {
    protected int count;
    protected double mean;

    public void processSequence(Iterator<E> iterator) {
        while (iterator.hasNext()) {
            E element = iterator.next();
            processElement(element);
        }
    }
    protected abstract void processElement(E element);

    public int getCount() {
        return this.count;
    }
    public double getMean() {
        return this.mean;
    }
}
