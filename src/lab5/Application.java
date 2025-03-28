package lab5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try {
            System.out.println("Adăugare newline la sfârșitul fiecărei linii:");
            addNewLineAtEndOfEachLine("in.txt");
            System.out.println("\n\n");

            System.out.println("Adăugare newline după fiecare punct:");
            addNewLineAfterDot("in.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // a)
    static void addNewLineAtEndOfEachLine(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        List<String> allLinesInMemory = Files.readAllLines(path);
        for (String line : allLinesInMemory) {
            System.out.println(line + "\n");
        }
    }

    // b)
    static void addNewLineAfterDot(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        List<String> allLinesInMemory = Files.readAllLines(path);
        for (String line : allLinesInMemory) {
            String modifiedLine = line.replace(".", ".\n");
            System.out.println(modifiedLine);
        }
    }
}
