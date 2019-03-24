package course.lesson15.case03_operator;

public class OperatorSub extends Operator {
    public OperatorSub() {
        super("-");
    }

    @Override
    public double execute() {
        return left - right;
    }
}
