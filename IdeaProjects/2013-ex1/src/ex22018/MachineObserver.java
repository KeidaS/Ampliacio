package ex22018;

import java.util.Observable;
import java.util.Observer;

public class MachineObserver implements Observer{
    Observable observable;
    private long id;

    public MachineObserver(Observable observable) {
        observable = observable;
    }
    @Override
    public void update(Observable o, Object arg) {
        if (o.hasChanged()) {
            id = (long) arg;
            System.out.print(id);
        }
        observable.notifyObservers(id);
    }
}
