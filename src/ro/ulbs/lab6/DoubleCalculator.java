package ro.ulbs.lab6;
//problema 2;

public class DoubleCalculator extends ACalculator {

    public DoubleCalculator(double initialValue) {
        this.state = initialValue;
    }

    @Override
    protected void init() {
        this.state = 0.0;
    }

    public DoubleCalculator add(double value) {
        this.state = (Double) this.state + value;
        return this;
    }

    public DoubleCalculator subtract(double value) {
        this.state = (Double) this.state - value;
        return this;
    }

    public DoubleCalculator multiply(double value) {
        this.state = (Double) this.state * value;
        return this;
    }
}

