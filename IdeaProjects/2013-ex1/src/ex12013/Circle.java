package ex12013;

public class Circle extends Figure {
    private float r;

    public void setRadius(float r) {
        this.r= r;
        //notifier(); -> Està be, sol es per compilar kek
    }
    public float getRadius() {
        return this.r;
    }
}
