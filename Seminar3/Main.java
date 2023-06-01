package Seminar3;

public class Main {

    public static void main(String[] args) {

//        Student student = new Student(12L, "Иван");
//        System.out.println(student.getFullName());
//        System.out.println(student);

        StudentGroup group = new StudentGroup();
        group.addStudent(new Student(4L, "Ivan Morozov"));
        group.addStudent(new Student(6L, "Petr Vorobev"));
        group.addStudent(new Student(2L, "Sidor Sidorov"));
        group.addStudent(new Student(1L, "Elena Ivanova"));
        group.addStudent(new Student(8L, "Anna Morozova"));

        StudentService Service = new StudentService(group);
        StudentController controller = new StudentController(Service);

        controller.printAll();


    }

}
