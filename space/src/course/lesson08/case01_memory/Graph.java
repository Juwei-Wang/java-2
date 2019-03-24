package course.lesson08.case01_memory;

/**
 * Created by Zhaozhe on 11/11/2016.
 */
public class Graph {

    public static void main(String[] args) {
        new Graph().run();
    }

    public void run(){
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 5);
        Point p3 = new Point(8, 2);
        Point p4 = new Point(12, 4);
        Point p5 = new Point(14, 6);

        Circle c = new Circle(p1, 2);
        Rectangle r = new Rectangle(p4, 10, 4);

        System.out.println(c.area());
        System.out.println(r.area());

        System.out.println(r.hitTest(p2));
        System.out.println(r.hitTest(p3));
        System.out.println(r.hitTest(p5));

        System.out.println(c.hitTest(p2));
        System.out.println(c.hitTest(p3));
        System.out.println(c.hitTest(p5));

    }
}
