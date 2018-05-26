package ex12015;

import java.util.ArrayList;

public class Group {
    private int students;
    private ArrayList<Student> list = new ArrayList<Student>();

    public void addStudent(Student student) {
        list.add(student);
        this.students++;
    }
    public int getStudents() {
        return this.students;
    }
    public Student getStudent(int i) {
        return list.get(i);
    }
}
