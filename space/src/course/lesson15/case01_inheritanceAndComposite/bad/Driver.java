package course.lesson15.case01_inheritanceAndComposite.bad;

public class Driver {
    public static void main(String[] args) {
        Circle circle = new Circle(3, 4, 6);
        circle.hitTest(new Point(4, 5));
    }
}
