package ex32017;

import java.util.ArrayList;
import java.util.Map;

public class Register {

    private boolean created = false;
    private Map< String, MachineComponent> components;
    private static Register rs;
    public static final Register rs1 = new Register();

    private Register() {

    }
    //Lazy
    public Register createSingleton() {
        if (!this.created) {
            created = true;
            rs = new Register();
        }
        return rs;
    }

    public void addComponent(String name, MachineComponent mc) {
        components.put(name, mc);
    }
    public void getComponent(String name) {
        components.get(name);
    }
}
