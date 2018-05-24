package recu12013;

import java.util.Observable;
import java.util.Observer;

public class Figure extends Observable implements Observer{
    protected float x;
    protected float y;

    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public void setX(float x) {
        this.x = x;
        notifier();
    }
    public void setY(float y) {
        this.y = y;
        notifier();
    }
    public float getX() {
        return this.x;
    }
    public float getY() {
        return this.y;
    }
    public void notifier() {
        setChanged();
        notifyObservers();
    }
    @Override
    public void update(Observable o, Object arg) {
        //El qe sigui
        notifier();
    }
}
