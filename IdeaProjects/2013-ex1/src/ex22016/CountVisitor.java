package ex22016;

/**
 * Created by anb1 on 25/05/18.
 */
public class CountVisitor extends VisitorTemplate implements Visitor {

    @Override
    protected void operation(Leaf l) {
            number++;
    }
}
