package problema18;

/**
 * Created by anb1 on 26/05/18.
 */
public class Text extends Figure{

    @Override
    public void clickButtonOn() {

    }

    @Override
    public void drag() {

    }

    @Override
    public void display() {

    }

    @Override
    public InteractionFactory makeInteraction() {
        return new TextInteraction();
    }
}
