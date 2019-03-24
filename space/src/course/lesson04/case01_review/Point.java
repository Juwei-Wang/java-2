package course.lesson04.case01_review;

public class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String description() {
        return "( " + (int)this.x + " , " + (int)this.y + " )";
    }

    public double distanceToOrigin() {
        return distanceTo(0, 0);
    }

    public double distanceTo(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return distance;
    }

    public void cross() {
        double temp = this.x;
        this.x = this.y;
        this.y = temp;
    }

    public void flip() {
        this.x = (-1) * this.x;
        this.y = (-1) * this.y;

//        this.x = -this.x;
//        this.x *= -1;
    }

    public void unitize() {
        if (this.x > 0) {
            this.x = 1;
        }
        if (this.x < 0) {
            this.x = -1;
        }
        if (this.y > 0) {
            this.y = 1;
        }
        if (this.y < 0) {
            this.y = -1;
        }
    }
}