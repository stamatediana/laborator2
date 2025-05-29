package ro.ulbs.lab10.src.main.src.main.java.main;

import lab10.src.main.java.storage.DataRepository;
import ro.ulbs.lab10.src.main.src.main.java.dataprocessing.StepCountStrategy;
import ro.ulbs.lab10.src.main.src.main.java.storage.DataAggregator;
import ro.ulbs.lab10.src.main.src.main.java.storage.SensorData;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        System.out.println("Choose a strategy: type 'basic' or 'filtered'");
        Scanner scanner = new Scanner(System.in);
        String strategyType = scanner.next();
        scanner.close();

        DataRepository dataRepository = DataRepository.getInstance();

        StepCountStrategy strategy = Utils.getStrategy(strategyType);
        DataAggregator aggregator = new DataAggregator(strategy);

        long baseTimestamp = System.currentTimeMillis();

        dataRepository.addData(new SensorData(10, baseTimestamp + 1));
        dataRepository.addData(new SensorData(20, baseTimestamp + 2));
        dataRepository.addData(new SensorData(30, baseTimestamp + 3));
        dataRepository.addData(new SensorData(4000, baseTimestamp + 4));
        dataRepository.addData(new SensorData(50, baseTimestamp + 5));
        dataRepository.addData(new SensorData(-100, baseTimestamp + 6));
        dataRepository.addData(new SensorData(500, baseTimestamp + 600));

        System.out.println("====================================================");
        aggregator.receive(dataRepository);
        System.out.println(aggregator.getResults());
        System.out.println("====================================================");
    }
}
