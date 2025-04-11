package ro.ulbs.lab6;
//problema 1;

public class IntCalculator {
    private int state;

    public IntCalculator(int initialValue) {
        this.state = initialValue;
    }

    public IntCalculator add(int value) {
        this.state += value;
        return this;
    }

    public IntCalculator subtract(int value) {
        this.state -= value;
        return this;
    }

    public IntCalculator multiply(int value) {
        this.state *= value;
        return this;
    }

    public IntCalculator clear() {
        this.state = 0;
        return this;
    }

    public int result() {
        return this.state;
    }

    public static void main(String[] args) {
        IntCalculator calculator = new IntCalculator(10);
        int result = calculator.add(5).subtract(3).multiply(2).result();
        System.out.println("a) " + result);
    }
}
