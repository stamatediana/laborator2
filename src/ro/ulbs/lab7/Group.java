package ro.ulbs.lab7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Group {
    private List<Student> students;
    public Group () {
        students = new ArrayList<Student>();
    }
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public boolean removeStudent(Student student) {
        Iterator<Student> it = students.iterator();
        boolean removedAll = false;
        while (it.hasNext()) {
            Student st = it.next();
            if (null != st.getName() && st.getName().equals(student.getName())) {
                it.remove();
                removedAll = true;
            }
        }
        return removedAll;
    }
    public Student getStudent(String name) {
        for (Student st : students) {
            if (null != st.getName() && st.getName().equals(name)) {
                return st;
            }
        }
        return null;
    }
    public boolean areStudentsInGroup() {
        if (0 == students.size()) {
            return false;
        }
        return true;
    }
}