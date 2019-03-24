package course.lesson15.case01_inheritanceAndComposite.good;

public class Circle {
    // private int x;
    // private int y;
    private Point center;
    private int radius;

    public Circle() {

    }

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean hitTest(Point target) {
        return center.distanceTo(target) < radius;
    }
}
