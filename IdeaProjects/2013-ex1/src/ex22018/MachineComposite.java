package ex22018;

import java.util.List;
import java.util.Observable;



public class MachineComposite extends MachineComponent {
    private List<MachineComponent> list;
    private Observable observable = new Observable();
    private MachineObserver mo = new MachineObserver(observable);

    public void addComponent(MachineComponent mc) {
        list.add(mc);
        observable.notifyObservers(this.getId());
        if (mc instanceof MachineComposite) {
            ((MachineComposite) mc).getObservable().addObserver(mo);
        }
    }

    public Observable getObservable() {
        return this.observable;
    }
}
