package ro.ulbs.lab10.src.main.src.main.java.storage;

import ro.ulbs.lab10.src.main.src.main.java.dataprocessing.StepCountStrategy;

public class BasicStepCountStrategy implements StepCountStrategy {
    private int totalSteps = 0;

    @Override
    public void consumeMessage(SensorData sample) {
        totalSteps += sample.getStepsCount();
    }

    @Override
    public int getTotalSteps() {
        return totalSteps;
    }

    @Override
    public String getStrategyDescription() {
        return "BasicStepCountStrategy";
    }
}
