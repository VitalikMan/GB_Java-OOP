package Seminar3.HomeWork;

public class StudentController {

    public StudentGroupService studentGroupService;

    public StudentController(StudentGroupService studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    public void printAll() {
        studentGroupService.printAll();
    }

    public boolean deleteStudent(String fullName) {
        studentGroupService.deleteStudent(fullName);
        return true;
    }

    public void addStudent(Student student) {
        studentGroupService.addStudent(student);
    }

    public void compareTo(){
        studentGroupService.compareTo();
    }

    public void sortByName() {
        studentGroupService.sortByName();
    }

    public void sortBySurname() {
        studentGroupService.sortBySurname();
    }

    public void sortByID() {
        studentGroupService.sortById();
    }

}
