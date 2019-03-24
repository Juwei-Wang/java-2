package course.lesson15.case04_equals;

import java.util.LinkedList;

public class Driver {
    public static void main(String[] args) {
        new Driver().run();
    }

    public void run() {
        LinkedList<Point> points = new LinkedList<>();
        Point e = new Point(3, 4);
        points.add(e);
        check(points);
    }


    // 用参数导进去
    private void check(LinkedList<Point> points) {
        points.contains(3);
        System.out.println(points.contains(new Point(3, 4)));
    }
}
