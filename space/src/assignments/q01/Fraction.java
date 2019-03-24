package assignments.q01;

public class Fraction {
    public int numerator;
    public int denominator;

    public double value() {
        return 1.0 * numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}
