package Seminar4.HomeWork.service;

import Seminar4.HomeWork.model.Teacher;
import Seminar4.HomeWork.model.User;
import Seminar4.HomeWork.repository.TeacherRepository;
import Seminar4.HomeWork.repository.UserRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements UserService<Teacher> {
    private final UserRepository<Teacher> teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        for (Teacher teacher : teacherRepository.getAll()) {
            if (teacher.getFullName().equals(fullName)) {
                System.out.println("(create:)'"+fullName+ "' <- запись уже существует");
                return;
            }
        }
        Long id = teacherRepository.getMaxId() + 1;
        Teacher teacher = new Teacher(id, fullName, age, phoneNumber);
        teacherRepository.add(teacher);
    }

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.getAll();
    }

    @Override
    public List<Teacher> getAllSortUsers() {
        System.out.println("Сортировка всего списка учителей:");
        List<Teacher> teachers = teacherRepository.getAll();
        Collections.sort(teachers);
        return teachers;
    }

    @Override
    public List<Teacher> getAllSortUsersByFamilyName() {
        System.out.println("Сортировка по фамилии:");
        List<Teacher> teachers = teacherRepository.getAll();
        teachers.sort(new UserComparator<>());
        return teachers;
    }

    @Override
    public List<Teacher> getAllSortUsersByAge() {
        System.out.println("Сортировка по возрасту:");
        List<Teacher> teachers = teacherRepository.getAll();
        teachers.sort(Comparator.comparing(User::getAge));
        return teachers;
    }

    @Override
    public void removeUser(String fullName) {
        teacherRepository.remove(fullName);
    }

    @Override
    public void edit(Long id) {
        Scanner in = new Scanner(System.in);
        System.out.println("Редактирование учителя");
        for (Teacher teacher : teacherRepository.getAll()) {
            if (teacher.getId().equals(id)){
                System.out.print("Введите полное имя: ");
                teacher.setFullName(in.nextLine());
                System.out.print("Введите возраст: ");
                teacher.setAge(Integer.valueOf(in.nextLine()));
                System.out.print("Введите номер телефона: ");
                teacher.setPhoneNumber(in.nextLine());

            }

        }
    }
}
