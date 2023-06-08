package Seminar3.Seminar;

public class Main {

    public static void main(String[] args) {

        StudentGroup group = new StudentGroup();
        StudentRepository repository = new StudentRepository(group);
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
//----------------------------------------------------------------------
        group.addStudent(new Student(4L, "Ivan Morozov"));
        group.addStudent(new Student(6L, "Petr Vorobev"));
        group.addStudent(new Student(2L, "Sidor Sidorov"));
        group.addStudent(new Student(1L, "Elena Ivanova"));
        group.addStudent(new Student(8L, "Anna Morozova"));

        controller.printAll();


    }

}
