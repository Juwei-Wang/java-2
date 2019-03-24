package course.lesson15.case01_inheritanceAndComposite.good;

public class Driver {
    public static void main(String[] args) {
        Point center = new Point(3, 4);
        Circle circle = new Circle(center, 6);
        circle.hitTest(new Point(4, 5));
    }
}

// composite > inherit