package Seminar5.HomeWork;

import Seminar5.HomeWork.controllers.StudentController;
import Seminar5.HomeWork.controllers.StudyGroupController;
import Seminar5.HomeWork.controllers.TeacherController;
import Seminar5.HomeWork.model.StudyGroup;
import Seminar5.HomeWork.repository.StudentRepository;
import Seminar5.HomeWork.repository.TeacherRepository;
import Seminar5.HomeWork.service.StudentService;
import Seminar5.HomeWork.service.StudyGroupService;
import Seminar5.HomeWork.service.TeacherService;
import Seminar5.HomeWork.view.SortType;
import Seminar5.HomeWork.view.StudentGroupView;
import Seminar5.HomeWork.view.StudentView;
import Seminar5.HomeWork.view.TeacherView;

public class Main {
    public static void main(String[] args) {

//---------------------------------------<Student>-----------------------------------------------------
        StudentRepository studentRepository = new StudentRepository();
        StudentService studentService = new StudentService(studentRepository);
        StudentController studentController = new StudentController(studentService);
        StudentView studentView = new StudentView(studentController);

        System.out.println("=".repeat(50));
        studentView.create("Maria Zobkova", 19, "001", "1");
        studentView.create("Ilya Medyankin", 19, "002", "2");
        studentView.create("Vladimir Poboykin", 20, "003","3");
        studentView.create("Ivan Ivanov", 20, "003","2");
        studentView.create("Andrey Andreev", 20, "003","3");
        studentView.create("Darya Menshikova", 19, "555","1");

//        studentView.sendOnConsole(SortType.NONE);
//        studentView.sendOnConsole(SortType.NAME);
//        studentView.sendOnConsole(SortType.FAMILY);
//        studentView.sendOnConsole(SortType.AGE);

//---------------------------------------<Teacher>-----------------------------------------------------
        TeacherRepository repository = new TeacherRepository();
        TeacherService service = new TeacherService(repository);
        TeacherController controller = new TeacherController(service);
        TeacherView teacherView = new TeacherView(controller);

        teacherView.create("Ilnar Shafigullin", 37, "01", "1");
        teacherView.create("Sergey Kamyaneckiy", 36, "02", "2");
        teacherView.create("Ivan Cheklin", 35, "03", "3");

//        teacherView.sendOnConsole(SortType.NONE);
//        teacherView.sendOnConsole(SortType.NAME);
//        teacherView.sendOnConsole(SortType.FAMILY);
//        teacherView.sendOnConsole(SortType.AGE);
//        teacherView.editTeacher(2L);
//        teacherView.sendOnConsole(SortType.NONE);

//---------------------------------------<StudyGroup>-----------------------------------------------------
        StudyGroup group = new StudyGroup("1");
        StudyGroupService groupService = new StudyGroupService(group, studentRepository, repository);
        StudyGroupController groupController = new StudyGroupController(groupService);
        StudentGroupView groupView = new StudentGroupView(groupController);

        groupView.addUsers(studentRepository, repository);
        System.out.println("Список группы:");
        groupView.sendOnConsole(SortType.NONE);
        System.out.println("Список студентов в группе:");
        groupView.sendOnConsole(SortType.STUDENT);
        System.out.println("Преподаватель группы:");
        groupView.sendOnConsole(SortType.TEACHER);
    }
}

