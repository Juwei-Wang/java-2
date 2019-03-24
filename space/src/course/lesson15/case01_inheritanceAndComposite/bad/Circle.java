package course.lesson15.case01_inheritanceAndComposite.bad;

public class Circle extends Point {
    private int radius;

    public Circle() {

    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean hitTest(Point target) {
        return distanceTo(target) < radius;
    }
}
