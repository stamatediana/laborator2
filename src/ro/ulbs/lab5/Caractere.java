package ro.ulbs.lab5;
//prob2
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Caractere {
    public static void main(String[] args) {

        List<String> words = generateWords(50);
        try {
            writeWordsToFile(words, "outrand.txt");
            System.out.println("Cuvintele au fost scrise cu succes în outrand.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    static List<String> generateWords(int numberOfWords) {
        List<String> words = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < numberOfWords; i++) {
            StringBuilder word = new StringBuilder();
            for (int j = 0; j < 4; j++) {
                char randomChar = (char) ('a' + random.nextInt(26));
                word.append(randomChar);
            }
            words.add(word.toString());
        }
        Collections.sort(words);
        return words;
    }


    static void writeWordsToFile(List<String> words, String fileName) throws IOException {
        Path path = Paths.get(fileName);
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {

            for (int i = 0; i < words.size(); i++) {
                writer.write(words.get(i));
                if ((i + 1) % 10 == 0) {
                    writer.newLine();
                } else {
                    writer.write(" ");
                }
            }
        }
    }}
