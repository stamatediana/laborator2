package ro.ulbs.lab10.src.main.src.main.java.main;

import ro.ulbs.lab10.src.main.src.main.java.dataprocessing.StepCountStrategy;
import ro.ulbs.lab10.src.main.src.main.java.storage.BasicStepCountStrategy;
import ro.ulbs.lab10.src.main.src.main.java.storage.FilteredStepCountStrategy;

public class Utils {
    public static final String BASIC_STRATEGY = "basic";
    public static final String FILTERED_STRATEGY = "filtered";

    public static int getClientId() {
        return 42;
    }

    public static StepCountStrategy getStrategy(String type) {
        if (BASIC_STRATEGY.equalsIgnoreCase(type)) {
            return new BasicStepCountStrategy();
        } else if (FILTERED_STRATEGY.equalsIgnoreCase(type)) {
            return new FilteredStepCountStrategy();
        } else {
            throw new IllegalArgumentException("Unknown strategy type: " + type);
        }
    }
}
