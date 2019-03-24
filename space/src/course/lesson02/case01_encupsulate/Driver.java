package course.lesson02.case01_encupsulate;

public class Driver {
    public static void main(String[] args) {
        new Driver().run();
    }

    public void run() {
        Fraction fraction = new Fraction();
        fraction.numerator = 3;
        fraction.denominator = 4;

//        // 使用 trace 间接调用 description
//        fraction.trace();

        // 不使用 trace 测试 description
        System.out.println(fraction.description());

        System.out.println(fraction.value());

    }
}
