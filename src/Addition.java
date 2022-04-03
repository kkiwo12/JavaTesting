public class Addition implements IOperation{
    @Override
    public double execute(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    @Override
    public int number(double num22, double num23) {
        return 0;
    }
}
