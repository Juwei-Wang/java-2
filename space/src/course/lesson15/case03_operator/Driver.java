package course.lesson15.case03_operator;

public class Driver {
    public static void main(String[] args) {
        Operator operator = new OperatorAdd();
        operator.left = 8;
        operator.right = 4;
        System.out.println(operator.display());
        System.out.println(operator.execute());
    }
}
