package Seminar4.HomeWork;

import Seminar4.HomeWork.controller.StudentController;
import Seminar4.HomeWork.controller.TeacherController;
import Seminar4.HomeWork.repository.StudentRepository;
import Seminar4.HomeWork.repository.TeacherRepository;
import Seminar4.HomeWork.service.StudentService;
import Seminar4.HomeWork.service.TeacherService;
import Seminar4.HomeWork.view.SortType;
import Seminar4.HomeWork.view.StudentView;
import Seminar4.HomeWork.view.TeacherView;

public class Main {
    public static void main(String[] args) {
        StudentView studentView = getStudentView();
        TeacherView teacherView = getTeacherView();
//-------------------------------<Students>--------------------------------------
        System.out.println("=".repeat(50));
        studentView.create("Ivan Morozov", 18, "02");
        studentView.create("Petr Vorobev", 19, "03");
        studentView.create("Sidor Sidorov", 20, "112");
        studentView.sendOnConsole(SortType.NONE);
        studentView.create("Elena Ivanova", 19, "911");
        studentView.create("Anna Morozova", 17, "01");
        studentView.sendOnConsole(SortType.NONE);
        studentView.sendOnConsole(SortType.NAME);
        studentView.sendOnConsole(SortType.FAMILY);
        studentView.sendOnConsole(SortType.AGE);
        studentView.removeUser("Elena Ivanova");
        studentView.sendOnConsole(SortType.NONE);
        studentView.create("Vasiliy Petrov", 22, "228");
        studentView.sendOnConsole(SortType.NONE);
//-------------------------------<Teachers>--------------------------------------
        System.out.println("*".repeat(50));
        teacherView.create("Maria Zobkova", 32, "070790");
        teacherView.create("Ilya Medyankin", 30, "010191");
        teacherView.create("Vladimir Poboykin", 35, "020281");
        teacherView.sendOnConsole(SortType.NONE);
        teacherView.sendOnConsole(SortType.NAME);
        teacherView.sendOnConsole(SortType.FAMILY);
        teacherView.sendOnConsole(SortType.AGE);
        teacherView.removeUser("Ilya Medyankin");
        teacherView.sendOnConsole(SortType.NONE);
        teacherView.edit(1L);
        teacherView.sendOnConsole(SortType.NONE);
    }

    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }

    public static TeacherView getTeacherView() {
        TeacherRepository repository = new TeacherRepository();
        TeacherService service = new TeacherService(repository);
        TeacherController controller = new TeacherController(service);
        return new TeacherView(controller);
    }

}