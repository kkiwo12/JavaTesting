public class Dog implements IAnimal, IOperation{

    private String name;
    private int dogg;
    private boolean canRun;

    @Override
    public int number(double num22, double num23) {

        return 0;
    }

    public Dog(int dogg) {
        this.dogg = dogg;
    }

    @Override
    public double execute(double firstNum, double secondNum) {
        double first = firstNum;
        double second = secondNum;
        return second - first;
    }

    @Override
    public void talk() {
        System.out.println("qqq");

    }

    @Override
    public void eat() {
        System.out.println(this.name + " is eating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog() {
    }


    public Dog(String name, int dogg, boolean canRun) {
        this.name = name;
        this.dogg = dogg;
        this.canRun = canRun;
    }

    public Dog(String name, int dogg) {
        this.name = name;
        this.dogg = dogg;
    }

    public int getDogg() {
        return dogg;
    }

    public void setDogg(int dogg) {
        this.dogg = dogg;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Class DOG: NAME => ").append(this.name).append("\n");
        return builder.toString();
    }
}
