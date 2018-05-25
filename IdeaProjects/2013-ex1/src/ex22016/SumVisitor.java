package ex22016;

/**
 * Created by anb1 on 25/05/18.
 */
public class SumVisitor extends VisitorTemplate implements Visitor {
    private int sum = 0;

    @Override
    public void doVisit(Leaf f) {
        number = number + f.getInfo();
    }
}
