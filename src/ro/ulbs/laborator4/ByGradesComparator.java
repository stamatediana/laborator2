//problema2
package ro.ulbs.laborator4;
import java.util.Comparator;

class ByGradesComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Float.compare(o2.getMedie(), o1.getMedie());
    }
}

class ByRestanteComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getNrRestante(), o2.getNrRestante());
    }
}

