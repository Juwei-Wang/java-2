package assignments.q03;

public class LineSegmentDriver {
    public static void main(String[] args) {
        new LineSegmentDriver().run();
    }

    public void run() {
        {
            // prepare - 创建对象
            LineSegment lineSegment = new LineSegment();
            Point p1 = new Point(1, 1);
            Point p2 = new Point(3, 4);

            // prepare - 对象组装
            lineSegment.setEndPoint1(p1);
            lineSegment.setEndPoint2(p2);

            // call
            double slope = lineSegment.getSlope();

            // check
            System.out.println(slope);
        }
    }
}
