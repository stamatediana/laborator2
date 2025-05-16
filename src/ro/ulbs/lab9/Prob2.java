package ro.ulbs.lab9;
import java.util.*;
import java.util.stream.Collectors;

public class Prob2{
        public static void main(String[] args) {

            List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);


            List<Integer> squaredDistinct = numbers.stream()
                    .distinct()
                    .map(n -> n * n)
                    .collect(Collectors.toList());

            System.out.println("Lista originală: " + numbers);
            System.out.println("Pătratele valorilor distincte: " + squaredDistinct);
        }
    }


