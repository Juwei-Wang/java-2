package course.lesson15.case03_operator;

public class Operator {
    protected double left;
    protected double right;
    private String icon;

    public Operator(String icon) {
        this.icon = icon;
    }

    public double execute() {
        return 0;
    }

    public String display() {
        return left + " " + icon + " " + right;
    }

    @Override
    public String toString() {
        return display();
    }

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public double getRight() {
        return right;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public String getIcon() {
        return icon;
    }
}
