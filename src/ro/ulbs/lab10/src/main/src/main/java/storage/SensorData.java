package ro.ulbs.lab10.src.main.src.main.java.storage;

/**
 * Represents the sensing data sent to the storage component
 */
public class SensorData {
    private int stepsCount;
    private long timestamp;

    public SensorData(int stepsCount, long timestamp) {
        this.stepsCount = stepsCount;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return String.format("stepsCount=%d, timestamp=%d", stepsCount, timestamp);
    }


    public int getStepsCount() {
        return stepsCount;
    }

    public long getTimestamp() {
        return timestamp;
    }

}
