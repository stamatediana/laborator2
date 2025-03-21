//problema2
package ro.ulbs.laborator4;
import java.util.*;

public class Student {
    private String nume;
    private String grupa;
    private List<Integer> note;

    public Student(String nume, String grupa) {
        this.nume = nume;
        this.grupa = grupa;
        this.note = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public String getGrupa() {
        return grupa;
    }

    public void adaugaNota(int nota) {
        note.add(nota);
    }

    public boolean esteIntegralist() {
        return note.stream().allMatch(nota -> nota >= 5);
    }

    public float getMedie() {
        return (float) note.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public int getNrRestante() {
        return (int) note.stream().filter(nota -> nota < 5).count();
    }
}
