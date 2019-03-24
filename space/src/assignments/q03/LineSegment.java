package assignments.q03;

public class LineSegment {
    private Point endPoint1;
    private Point endPoint2;

    public double getSlope() {
        //  属性
        //  +   endPoint1: Point
        //      +   x: double
        //      +   y: double
        //  +   endPoint2: Point
        //      +   x: double
        //      +   y: double
        //  参数
        //  局部变量
        double dy = endPoint2.getY() - endPoint1.getY();
        double dx = endPoint2.getX() - endPoint1.getX();
        return dy / dx;
    }

    public Point getVector() {
        Point result = new Point();
        //  属性
        //  +   endPoint1: Point
        //      +   x: double
        //      +   y: double
        //  +   endPoint2: Point
        //      +   x: double
        //      +   y: double
        //  参数
        //  局部变量
        //  +   result: Point
        //      +   x: double
        //      +   y: double

        return result;
    }

    public Point getEndPoint1() {
        return endPoint1;
    }

    public void setEndPoint1(Point endPoint1) {
        this.endPoint1 = endPoint1;
    }

    public Point getEndPoint2() {
        return endPoint2;
    }

    public void setEndPoint2(Point endPoint2) {
        this.endPoint2 = endPoint2;
    }
}
