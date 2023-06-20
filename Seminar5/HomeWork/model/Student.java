package Seminar5.HomeWork.model;

import lombok.*;

@Getter
//@Setter
//@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Student extends User implements Comparable<Student> {

    public Student(Long id, String fullName, Integer age, String phoneNumber, String groupId) {
        super(id, fullName, age, phoneNumber, groupId);
    }

    @Override
    public int compareTo(Student o) {
        return getFullName().compareTo(o.getFullName());
    }

    @Override
    public String toString() {
        return String.format("Student: %s\t%s\t%s\t%s", getId(), getFullName(), getAge(), getPhoneNumber());
    }
}