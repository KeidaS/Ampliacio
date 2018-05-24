package ex12013;
//Apartat a i b.
/*
import java.util.Observable;
public abstract class Figure extends Observable{
    protected float x;
    protected float y;
    public void setX(float x){
        this.x = x;
        notifier();
    }
    public void setY(float y){
        this.y = y;
        notifier();
    }
    public void notifier(){
        setChanged();
        notifyObservers();
    }
}*/

//Apartat c

public abstract class Figure {
    protected float x;
    protected float y;

    private FigureNotifier fignot;

    public void setX(float x){
        this.x = x;
        fignot.notifier();
    }
    public void setY(float y){
        this.y = y;
        fignot.notifier();
    }
    public void setNotifier(FigureNotifier fignot) {
        this.fignot = fignot;
    }
}