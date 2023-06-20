package Seminar5.HomeWork.service;

import Seminar5.HomeWork.repository.StudentRepository;
import Seminar5.HomeWork.model.Student;
import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
public class StudentService implements UserService<Student> {

    private final StudentRepository studentRepository;

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String groupId) {
        Long id =studentRepository.getMaxId() + 1;
        Student student = new Student(id, fullName, age, phoneNumber, groupId);
        studentRepository.add(student);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    @Override
    public List<Student> getAllSortUsers() {
        System.out.println("\t\tСортировка всего списка студентов");
        List<Student> students = studentRepository.getAll();
        Collections.sort(students);
        return students;
    }

    @Override
    public List<Student> getAllSortUsersByFamilyName() {
        System.out.println("\t\t\tСортировка по фамилии");
        List<Student> students = studentRepository.getAll();
        students.sort(new UserComparatorBySecondName<>());
        return students;
    }

    @Override
    public List<Student> getAllSortUsersByAge() {
        System.out.println("\t\t\tСортировка по возрасту");
        List<Student> students = studentRepository.getAll();
        students.sort(new UserComparatorByAge<>());
        return students;
    }

    @Override
    public void removeUser(String fullName) {
        studentRepository.remove(fullName);
    }
}







