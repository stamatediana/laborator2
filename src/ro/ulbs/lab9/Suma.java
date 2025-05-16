package ro.ulbs.lab9;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Suma {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> randomNumbers = IntStream.range(0, 10)
                .map(i -> random.nextInt(5, 25))
                .boxed()
                .collect(Collectors.toList());
        System.out.println(randomNumbers);


    }
}