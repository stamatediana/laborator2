package ro.ulbs.lab9;
import java.util.*;
import java.util.stream.Collectors;

public class Prob3 {
    public static void main(String[] args) {

        String text = "Acesta este un program scris cu java 8 si expresii lambda";
        List<String> words = Arrays.asList(text.split(" "));


        List<String> longWords = words.stream()
                .filter(w -> w.length() >= 5)
                .collect(Collectors.toList());

        System.out.println("Cuvinte cu lungimea >= 5: " + longWords);
        System.out.println("Număr cuvinte: " + longWords.size());


        List<String> sortedLongWords = longWords.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Cuvinte sortate: " + sortedLongWords);


        Optional<String> startsWithP = words.stream()
                .filter(w -> w.startsWith("p"))
                .findFirst();

        if (startsWithP.isPresent()) {
            System.out.println("Primul cuvânt care începe cu 'p': " + startsWithP.get());
        } else {
            System.out.println("Nu există cuvânt care începe cu 'p'.");
        }
    }

}
