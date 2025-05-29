package ro.ulbs.lab10.src.main.src.main.java.dataprocessing;
import ro.ulbs.lab10.src.main.src.main.java.storage.SensorData;

/**
 * Defines the operations that can be performed on step data. Each implementation uses its own algorithm.
 */
public interface StepCountStrategy {

    /**
     * Consumes a sensor data sample
     * @param sample
     */
    void consumeMessage(SensorData sample);

    /**
     * Computes and returns the total number of steps since the app started running.
     */
    int getTotalSteps();

    /**
     * Returns a string describing this strategy, to be used for printing purposes.
     */
    String getStrategyDescription();
}
