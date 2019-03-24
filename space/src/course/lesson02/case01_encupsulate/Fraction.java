package course.lesson02.case01_encupsulate;

public class Fraction {
    public int numerator;
    public int denominator;

//    // 写了trace
    public void trace() {
        // 调谁的 trace，就调谁的 description
        System.out.println(this.description());
    }

    public String description() {
        return this.numerator + "/" + denominator;
    }

    public double value() {
        return 1.0 * numerator / denominator;
    }
}
