package ro.ulbs.lab10.src.main.src.main.java.main;

import ro.ulbs.lab10.src.main.src.main.java.dataprocessing.StepCountStrategy;
import ro.ulbs.lab10.src.main.src.main.java.storage.SensorData;

import java.util.ArrayList;
import java.util.List;

public class FilteredStepCountStrategy implements StepCountStrategy {
    private final List<SensorData> validData = new ArrayList<>();

    @Override
    public void consumeMessage(SensorData sample) {
        if (sample.getStepsCount() <= 0) return;

        long oneMinuteAgo = sample.getTimestamp() - 60000;
        int stepsInLastMinute = 0;

        for (SensorData data : validData) {
            if (data.getTimestamp() >= oneMinuteAgo) {
                stepsInLastMinute += data.getStepsCount();
            }
        }

        if (stepsInLastMinute <= 1000) {
            validData.add(sample);
        }
    }

    @Override
    public int getTotalSteps() {
        return validData.stream().mapToInt(SensorData::getStepsCount).sum();
    }

    @Override
    public String getStrategyDescription() {
        return "FilteredStepCountStrategy";
    }
}
