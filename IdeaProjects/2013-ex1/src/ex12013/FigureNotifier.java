package ex12013;

import java.util.Observable;

public class FigureNotifier extends Observable {
    public void notifier() {
        setChanged();
        notifyObservers();
    }
}
