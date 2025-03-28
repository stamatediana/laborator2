package ro.ulbs.laborator4;

import java.util.Objects;

public class Student3 {
    private String nume;
    private String prenume;
    private String grupa;
    private int[] note;

    public Student3(String nume, String prenume, String grupa, int[] note) {
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        this.note = note;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getGrupa() {
        return grupa;
    }

    public int[] getNote() {
        return note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return nume.equals(student.getNume()) && prenume.equals(student.prenume) && grupa.equals(student.getGrupa());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, prenume, grupa);
    }

    @Override
    public String toString() {
        return nume + " " + prenume + " " + grupa;
    }
}
