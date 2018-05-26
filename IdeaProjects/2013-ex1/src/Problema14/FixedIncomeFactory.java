package Problema14;

/**
 * Created by anb1 on 26/05/18.
 */
public class FixedIncomeFactory extends AbstractFactory {
    @Override
    public Employee createEmployee() {
        return new FixedIncome();
    }

    @Override
    public Temporal createTemporal() {
        return new TemporalFixedIncome();
    }
}
