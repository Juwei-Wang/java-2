package course.lesson15.case03_operator;

public class OperatorAdd extends Operator {

    public OperatorAdd() {
        super("+");
    }

    @Override
    public double execute() {
        return left + right;
    }
}
