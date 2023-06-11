package Seminar4.HomeWork.view;

import Seminar4.HomeWork.controller.UserController;
import Seminar4.HomeWork.model.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher> {
    UserController<Teacher> controller;

    public TeacherView(UserController<Teacher> controller) {
        this.controller = controller;
    }

    @Override
    public void sendOnConsole(String sortType) {
        List<Teacher> teachers = switch (sortType) {
            case SortType.NONE -> controller.getAll();
            case SortType.NAME -> controller.getAllSortUsers();
            case SortType.FAMILY -> controller.getAllSortUsersByFamilyName();
            case SortType.AGE -> controller.getAllSortUsersByAge();
            default -> null;
        };
        if (teachers == null) {
            System.out.println("teacher is null");
            return;
        }
        System.out.println("-".repeat(50));
        System.out.println("Список учителей:");
        for (Teacher teacher : teachers) {
            System.out.println("\t" + teacher);
        }
        System.out.println("-".repeat(50));
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        System.out.print("Добавлен новый учитель: \n\t");
        controller.create(fullName, age, phoneNumber);
    }

    @Override
    public void removeUser(String fullName) {
        System.out.print("Учитель удалён из списка: \n\t");
        System.out.println(fullName);
        controller.removeUser(fullName);
    }
}
