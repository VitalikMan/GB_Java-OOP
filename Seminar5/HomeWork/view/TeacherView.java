package Seminar5.HomeWork.view;

import Seminar5.HomeWork.controllers.TeacherController;
import Seminar5.HomeWork.controllers.UserController;
import Seminar5.HomeWork.model.Student;
import Seminar5.HomeWork.model.Teacher;
import lombok.Data;

import java.util.List;
@Data
public class TeacherView implements UserView<Teacher> {
    TeacherController controller;

    public TeacherView(TeacherController controller) {
        this.controller = controller;
    }

    @Override
    public void sendOnConsole(String sortType) {
        List<Teacher> teachers = switch (sortType) {
            case SortType.NONE -> controller.getAll();
            case SortType.NAME -> controller.getAllSortUsers();
            case SortType.FAMILY -> controller.getAllSortUsersByFamilyName();
            case SortType.AGE -> controller.getAllSortUsersByAge ();
            default -> null;
        };
        if (teachers == null)  {
            System.out.println("teachers is null");
            return;
        }
        System.out.println("-".repeat(50));
        System.out.println("Список учителей:");
        for (Teacher teacher: teachers) {
            System.out.println("\t" + teacher);
        }
        System.out.println("-".repeat(50));
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String groupId) {
        controller.create(fullName, age, phoneNumber, groupId);
    }

    @Override
    public void removeUser(String fullName) {
        System.out.print("Учитель удалён из списка: \n\t");
        System.out.println(fullName);
        controller.removeUser(fullName);
    }

    public boolean editTeacher(Long id){
        controller.editTeacher(id);
        return true;
    }
}
