package Seminar3.HomeWork;

import java.util.Comparator;

public class StudentComparatorByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFullName().split(" ")[0].compareTo(o2.getFullName().split(" ")[0]);
    }
}
