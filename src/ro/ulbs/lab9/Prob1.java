package ro.ulbs.lab9;
import java.util.*;
import java.util.stream.Collectors;

public class Prob1{
    public static void main(String[] args) {

        Random rand = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(21) + 5); // 0..20 + 5 => 5..25
        }

        System.out.println("Lista originală: " + numbers);


        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Suma: " + sum);


        int max = numbers.stream().max(Integer::compare).orElseThrow();
        int min = numbers.stream().min(Integer::compare).orElseThrow();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);


        List<Integer> filtered = numbers.stream()
                .filter(n -> n >= 10 && n <= 20)
                .collect(Collectors.toList());
        System.out.println("Elemente în [10..20]: " + filtered);


        List<Double> doubleList = numbers.stream()
                .map(Integer::doubleValue)
                .collect(Collectors.toList());
        System.out.println("Listă Double: " + doubleList);


        boolean contains12 = numbers.contains(12);
        System.out.println("Conține 12? " + contains12);
    }
}
