package Seminar3;

import java.util.Iterator;

public class StudentService {

    private StudentGroup studentGroup;
    public StudentService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void addStudent(Student student) {
        studentGroup.addStudent(student);
    }

    public void printAll() {
        for (Student student : studentGroup) {
            System.out.println(student);
        }
    }

    public void deleteStudent(String fullName) {
        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getFullName().equals(fullName)) {
                iterator.remove();
            }
        }
    }


}
