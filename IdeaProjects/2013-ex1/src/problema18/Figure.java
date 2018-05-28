package problema18;

public abstract class Figure {
    public abstract void clickButtonOn();
    public abstract void drag();
    public abstract void display();

    public abstract InteractionFactory makeInteraction();
}
