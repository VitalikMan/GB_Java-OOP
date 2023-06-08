package Seminar3.HomeWork;

import java.util.Comparator;
import java.util.Iterator;

public class StudentGroupService {

    private final StudentRepository studentRepository;
    public StudentGroupService(StudentRepository studentGroup) {
        this.studentRepository = studentGroup;
    }

    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    public void printAll() {
        int count = 1;
        System.out.println("Список студентов:");
        for (Student student : studentRepository.getStudentGroup()) {
            System.out.print(count++ + ") ");
            System.out.println(student);
        }
    }

    public void deleteStudent(String fullName) {
        int count = 1;
        Iterator<Student> iterator = studentRepository.getStudentGroup().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getFullName().equals(fullName)) {
                System.out.println("Отчисленные студенты:");
                System.out.println(count++ + ") " + fullName);
                iterator.remove();
            }
        }

    }

    public void compareTo(){
        System.out.println("Обычная сортировка:");
        studentRepository.getStudentGroup().getStudentsList().sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });
    }

    public void sortByName() {
        System.out.println("Сортировка по имени:");
        studentRepository.getStudentGroup().getStudentsList().sort(new StudentComparatorByName());
    }
    public void sortBySurname(){
        System.out.println("Сортировка по фамилии:");
        studentRepository.getStudentGroup().getStudentsList().sort(new StudentComparatorBySurname());
    }

    public void sortById(){
        System.out.println("Сортировка по ID:");
        studentRepository.getStudentGroup().getStudentsList().sort(new StudentComparatorByID());
    }

}
