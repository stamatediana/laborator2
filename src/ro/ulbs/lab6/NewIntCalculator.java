package ro.ulbs.lab6;
//problema 2;

public class NewIntCalculator extends ACalculator {

    public NewIntCalculator(int initialValue) {
        this.state = initialValue;
    }

    @Override
    protected void init() {
        this.state = 0;
    }

    public NewIntCalculator add(int value) {
        this.state = (Integer) this.state + value;
        return this;
    }

    public NewIntCalculator subtract(int value) {
        this.state = (Integer) this.state - value;
        return this;
    }

    public NewIntCalculator multiply(int value) {
        this.state = (Integer) this.state * value;
        return this;
    }
//problema 2 lab 7
public NewIntCalculator divide(int value) {
    if (value == 0) {
        throw new ArithmeticException("Cannot divide by zero.");
    }
    this.state = (Integer) this.state / value;
    return this;
}

}