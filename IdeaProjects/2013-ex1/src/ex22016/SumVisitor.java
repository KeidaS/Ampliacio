package ex22016;

/**
 * Created by anb1 on 25/05/18.
 */
public class SumVisitor extends VisitorTemplate implements Visitor {

    @Override
    public void operation(Leaf f) {
        number = number + f.getInfo();
    }
}
