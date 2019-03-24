package course.lesson02.case02_test;

public class Driver {
    public static void main(String[] args) {
        new Driver().run();
    }

    public void run() {
        {
            Fraction fraction = new Fraction();
            fraction.numerator = 3;
            fraction.denominator = 4;
            System.out.println(fraction.description());
        }
        {
            Fraction fraction = new Fraction();
            fraction.numerator = 3;
            fraction.denominator = 4;
            System.out.println(fraction.value());
        }
    }
}
