package lab10.src.main.java.storage;


import ro.ulbs.lab10.src.main.src.main.java.storage.SensorData;

import java.util.List;

/**
 * Persists sensor data.
 */
// TODO make this class singleton
public class DataRepository {
    private static  DataRepository instance;

    private DataRepository() {

    }

    public static DataRepository getInstance() {
        if (instance == null) {
            instance = new DataRepository();
        }
        return instance;
    }

    // TODO implement a method to get the stored data (needed by the strategies)
    public List<SensorData> getRecords() {
        return null;
    }

    public void addData(SensorData sensorData) {

    }
}