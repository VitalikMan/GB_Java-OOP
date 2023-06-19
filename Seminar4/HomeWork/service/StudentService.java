package Seminar4.HomeWork.service;

import Seminar4.HomeWork.model.Student;
import Seminar4.HomeWork.model.Teacher;
import Seminar4.HomeWork.model.User;
import Seminar4.HomeWork.repository.StudentRepository;
import Seminar4.HomeWork.repository.UserRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentService implements UserService<Student> {
    private final UserRepository<Student> studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        Long id = studentRepository.getMaxId() + 1;
        Student student = new Student(id, fullName, age, phoneNumber);
        studentRepository.add(student);
        System.out.println(student);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    @Override
    public List<Student> getAllSortUsers() {
        System.out.println("Сортировка всего списка студентов:");
        List<Student> students = studentRepository.getAll();
        Collections.sort(students);
        return students;
    }

    @Override
    public List<Student> getAllSortUsersByFamilyName() {
        System.out.println("Сортировка по фамилии:");
        List<Student> students = studentRepository.getAll();
        students.sort(new UserComparator<>());
        return students;
    }

    @Override
    public List<Student> getAllSortUsersByAge() {
        System.out.println("Сортировка по возрасту:");
        List<Student> students = studentRepository.getAll();
/*        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });*/
//        students.sort((o1, o2) -> o1.getAge().compareTo(o2.getAge()));
        students.sort(Comparator.comparing(User::getAge));

        return students;
    }

    @Override
    public void removeUser(String fullName) {
        studentRepository.remove(fullName);
    }

    @Override
    public void edit(Long id) {
        Scanner in = new Scanner(System.in);
        System.out.println("Редактирование учителя");
        for (Student student : studentRepository.getAll()) {
            if (student.getId().equals(id)) {
                System.out.print("Введите полное имя: ");
                student.setFullName(in.nextLine());
                System.out.print("Введите возраст: ");
                student.setAge(Integer.valueOf(in.nextLine()));
                System.out.print("Введите номер телефона: ");
                student.setPhoneNumber(in.nextLine());

            }
        }
    }
}
