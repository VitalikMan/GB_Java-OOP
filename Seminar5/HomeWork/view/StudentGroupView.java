package Seminar5.HomeWork.view;

import Seminar5.HomeWork.controllers.StudyGroupController;
import Seminar5.HomeWork.model.Student;
import Seminar5.HomeWork.model.User;
import Seminar5.HomeWork.repository.StudentRepository;
import Seminar5.HomeWork.repository.TeacherRepository;
import java.util.List;

public class StudentGroupView {

    private final StudyGroupController groupController;

    public StudentGroupView(StudyGroupController groupController) {
        this.groupController = groupController;

    }

    public void sendOnConsole(String sortType) {
        List<User> groupList = switch (sortType) {
            case SortType.NONE -> groupController.getAll();
            case SortType.STUDENT -> groupController.getStudent();
            case SortType.TEACHER -> groupController.getTeacher();
            default -> null;
        };
        if (groupList == null)  {
            System.out.println("group is null");
            return;
        }
        System.out.println("-".repeat(50));
        for (User user : groupList) {
            System.out.println("\t" + user);
        }
        System.out.println("-".repeat(50));
    }
    public void addUsers(StudentRepository students, TeacherRepository teachers) {
        groupController.addUsers(students, teachers);
    }

//    public List<User> getAll(){
//        return groupController.getAll();
//    }
//
//    public void PrintAll(){
//        for (User user : groupController.getAll()) {
//            System.out.println(user);
//        };
//    }
//    public void PrintAllStudents(){
//        for (User user : groupController.getStudent()) {
//            System.out.println(user);
//        };
//    }
//    public List<User> getStudent(){
//        return groupController.getStudent();
//    }
}
