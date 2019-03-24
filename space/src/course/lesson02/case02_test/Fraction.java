package course.lesson02.case02_test;

public class Fraction {
    public int numerator;
    public int denominator;

//    // 写了trace
//    public void trace() {
//        System.out.println(description());
//    }

    public String description() {
        return numerator + "/" + denominator;
    }

    public double value() {
        return 1.0 * numerator / denominator;
    }
}
