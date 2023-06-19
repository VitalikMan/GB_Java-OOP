package Seminar4.HomeWork.view;

import Seminar4.HomeWork.controller.UserController;
import Seminar4.HomeWork.model.Student;

import java.util.List;

public class StudentView implements UserView<Student> {
    UserController<Student> controller;

    public StudentView(UserController<Student> controller) {
        this.controller = controller;
    }

    @Override
    public void sendOnConsole(String sortType) {
        List<Student> students = switch (sortType) {
            case SortType.NONE -> controller.getAll();
            case SortType.NAME -> controller.getAllSortUsers();
            case SortType.FAMILY -> controller.getAllSortUsersByFamilyName();
            case SortType.AGE -> controller.getAllSortUsersByAge();
            default -> null;
        };
        if (students == null)  {
            System.out.println("students is null");
            return;
        }
        System.out.println("-".repeat(50));
        System.out.println("Список студентов:");
        for (Student student : students) {
            System.out.println("\t" + student);
        }
        System.out.println("-".repeat(50));
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        System.out.print("Добавлен новый студент: \n\t");
        controller.create(fullName, age, phoneNumber);
    }

    @Override
    public void removeUser(String fullName) {
        System.out.print("Студент удалён из списка: \n\t");
        System.out.println(fullName);
        controller.removeUser(fullName);
    }

    @Override
    public void edit(Long id) {
        controller.edit(id);
    }
}
