package ro.ulbs.lab10.src.main.src.main.java.main;

import ro.ulbs.lab10.src.main.src.main.java.dataprocessing.StepCountStrategy;
import ro.ulbs.lab10.src.main.src.main.java.storage.SensorData;

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

