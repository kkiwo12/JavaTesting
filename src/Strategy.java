public class Strategy {
    private IOperation operation;
    private double firstNum;
    private double secondNum;

    public Strategy() {
    }

    public Strategy(IOperation operation) {
        this.operation = operation;
    }

    public IOperation getOperation() {
        return operation;
    }

    public void setOperation(IOperation operation) {
        this.operation = operation;
    }

    public double execute() {
        return operation.execute(firstNum, secondNum);
    }
}
