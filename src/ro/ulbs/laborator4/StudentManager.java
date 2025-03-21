package ro.ulbs.laborator4;//problema2
import ro.ulbs.laborator4.Student;
import java.util.*;

public class StudentManager {
    public static void main(String[] args) {

        List<Student> studenti = new ArrayList<>();
        Random rand = new Random();


        studenti.add(new Student("Ion Popescu", "A1"));
        studenti.add(new Student("Maria Ionescu", "A1"));
        studenti.add(new Student("Vasile Georgescu", "B2"));
        studenti.add(new Student("Ana Marinescu", "B2"));
        studenti.add(new Student("George Cristea", "A1"));


        for (Student student : studenti) {
            for (int i = 0; i < 5; i++) {
                student.adaugaNota(rand.nextInt(7) + 4);  // note între 4 și 10
            }
        }


        studenti.sort(Comparator.comparing(Student::getGrupa).thenComparing(Student::getNume));
        System.out.println("b1) Sortare alfabetic pe grupă:");
        studenti.forEach(s -> System.out.println(s.getGrupa() + " " + s.getNume()));

        // b)
        List<Student> integralisti = new ArrayList<>();
        for (Student s : studenti) {
            if (s.esteIntegralist()) {
                integralisti.add(s);
            }
        }
        integralisti.sort((Comparator<? super Student>) new ByGradesComparator());
        System.out.println("\nb2) Integralisti (ordine descrescătoare după medie):");
        integralisti.forEach(s -> System.out.println(s.getNume() + " - " + s.getMedie()));

        // b)
        List<Student> restantieri = new ArrayList<>();
        for (Student s : studenti) {
            if (!s.esteIntegralist()) {
                restantieri.add(s);
            }
        }
        restantieri.sort(new ByRestanteComparator());
        System.out.println("\nb3) Restanțieri (ordine crescătoare după numărul de restanțe):");
        restantieri.forEach(s -> System.out.println(s.getNume() + " - " + s.getNrRestante()));
    }
}

