package ro.ulbs.lab10.src.main.src.main.java.storage;
import lab10.src.main.java.storage.DataRepository;
import ro.ulbs.lab10.src.main.src.main.java.dataprocessing.StepCountStrategy;

public class DataAggregator  {
    private StepCountStrategy strategy;
    public DataAggregator(StepCountStrategy strategy) {
        this.strategy = strategy;
    }
    public void receive(DataRepository repo) {
        repo.getRecords().forEach(r -> strategy.consumeMessage(r));
    }

    public String getResults() {
        return String.format("Strategy %s: stepsCount=%d", strategy.getStrategyDescription(), strategy.getTotalSteps());
    }
}
