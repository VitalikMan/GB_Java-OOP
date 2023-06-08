package Seminar3.HomeWork;

import java.util.Comparator;

public class StudentComparatorBySurname implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFullName().split(" ")[1].compareTo(o2.getFullName().split(" ")[1]);
    }

}
