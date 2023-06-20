package Seminar5.HomeWork.service;

import Seminar5.HomeWork.model.Student;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {

    private final List<Student> studentList;
    private int position;

    public StudentGroupIterator(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return position < studentList.size();
    }

    @Override
    public Student next() {
        return studentList.get(position++);
    }

    @Override
    public void remove() {
        studentList.remove(--position);
    }
}