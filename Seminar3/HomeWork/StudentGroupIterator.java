package Seminar3.HomeWork;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;


public class StudentGroupIterator implements Iterator<Student> {

    private final List<Student> studentsList;
    private int position;

    public StudentGroupIterator(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
    public boolean hasNext() {
        return position < studentsList.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return studentsList.get(position++);
    }

    @Override
    public void remove() {
        studentsList.remove(--position);
    }
}
