package ex22016;

/**
 * Created by anb1 on 25/05/18.
 */
public class CountVisitor extends VisitorTemplate implements Visitor {
    private int count = 0;

    @Override
    protected void doVisit(Leaf l) {
        number++;
    }
}
