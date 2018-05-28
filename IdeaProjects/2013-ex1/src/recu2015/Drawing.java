package recu2015;

import com.sun.javafx.UnmodifiableArrayList;

import java.util.Collections;
import java.util.List;
/**
 * Created by anb1 on 28/05/18.
 */
public class Drawing extends Figure {
    List<Figure> list;
    public Drawing(double x, double y, List<Figure> list) {
        super(x, y);
        this.list = list;
    }
    public List<Figure> getComponents() {
            return Collections.unmodifiableList(list);
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
