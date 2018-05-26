package Problema14;

public class FixedIncomePlusCommissionsFactory extends AbstractFactory{
    @Override
    public Employee createEmployee() {
        return new FixedIncomePlusCommissions();
    }

    @Override
    public Temporal createTemporal() {
        return new TemporalFixedIncomePlusComissions();
    }
}
