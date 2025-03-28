package ro.ulbs.laborator4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Fiser {
    public static void main(String[] args) {
        Map<Student, Integer> studentCountMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(" ");


                String nume = details[0];
                String prenume = details[1];
                String grupa = details[2];


                int[] note = new int[details.length - 3];
                for (int i = 3; i < details.length; i++) {
                    note[i - 3] = Integer.parseInt(details[i]);
                }


                Student student = new Student(nume, prenume, grupa, note);

                studentCountMap.put(student, studentCountMap.getOrDefault(student, 0) + 1);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        for (Map.Entry<Student, Integer> entry : studentCountMap.entrySet()) {
            System.out.println(entry.getKey() + " apare de " + entry.getValue() + " ori.");
        }
    }
}
