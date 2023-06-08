package Seminar3.Seminar;

import java.util.Iterator;

public class StudentService {

    private final StudentRepository studentRepository;
    public StudentService(StudentRepository studentGroup) {
        this.studentRepository = studentGroup;
    }

    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    public void printAll() {
        for (Student student : studentRepository.getStudentGroup()) {
            System.out.println(student);
        }
    }

    public void deleteStudent(String fullName) {
        Iterator<Student> iterator = studentRepository.getStudentGroup().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getFullName().equals(fullName)) {
                iterator.remove();
            }
        }
    }



}
