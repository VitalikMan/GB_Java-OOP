package Seminar3.HomeWork;

//Домашнее задание:
//На основе кода с семинара(см. прикрепленные файлы)
//        - Модифицировать класс УчебнаяГруппаСервис, добавив в него метод сортировки списка студентов по имени;
//        - Модифицировать класс Контроллер, добавив в него метод сортировки списка студентов по имени и вызывать в нем
//        созданный метод из УчебнаяГруппаСервис;
//        - Создать класс СтудентКомпаратор реализующий интерфейс Comparator;
//        - Реализовать контракт compare () со сравнением по фамилии;
//        - Модифицировать класс УчебнаяГруппаСервис, добавив в него метод сортировки списка студентов по фамилии;
//        - Модифицировать класс Контроллер, добавив в него метод сортировки списка студентов по фамилии и вызывать в нем
//        созданный метод из УчебнаяГруппаСервис;

public class Main {

    public static void main(String[] args) {

        StudentGroup group = new StudentGroup();
        StudentRepository repository = new StudentRepository(group);
        StudentGroupService service = new StudentGroupService(repository);
        StudentController controller = new StudentController(service);
//----------------------------------------------------------------------
        group.addStudent(new Student(4L, "Ivan Morozov"));
        group.addStudent(new Student(6L, "Petr Vorobev"));
        group.addStudent(new Student(2L, "Sidor Sidorov"));
        group.addStudent(new Student(1L, "Elena Ivanova"));
        group.addStudent(new Student(8L, "Anna Morozova"));

        System.out.println("=".repeat(50));
        System.out.println("\t\t\t\t\tStart");
        System.out.println("=".repeat(50));
        controller.printAll();
        System.out.println("-".repeat(50));
        controller.compareTo();
        controller.printAll();
        System.out.println("-".repeat(50));
        controller.sortByName();
        controller.printAll();
        System.out.println("-".repeat(50));
        controller.sortBySurname();
        controller.printAll();
        System.out.println("-".repeat(50));
        controller.sortByID();
        controller.printAll();
        System.out.println("-".repeat(50));
        controller.deleteStudent("Elena Ivanova");
        System.out.println("-".repeat(50));
        controller.printAll();
        System.out.println("=".repeat(50));
        System.out.println("\t\t\t\t\tFinish");
        System.out.println("=".repeat(50));


    }

}
