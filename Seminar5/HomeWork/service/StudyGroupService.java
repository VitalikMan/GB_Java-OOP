package Seminar5.HomeWork.service;

import Seminar5.HomeWork.model.Student;
import Seminar5.HomeWork.model.StudyGroup;
import Seminar5.HomeWork.model.Teacher;
import Seminar5.HomeWork.model.User;
import Seminar5.HomeWork.repository.StudentRepository;
import Seminar5.HomeWork.repository.TeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    private StudentRepository students;
    private TeacherRepository teachers;
    private StudyGroup group;
    List<User> StudyList;

    public StudyGroupService(StudyGroup group, StudentRepository students, TeacherRepository teachers) {
        this.students = students;
        this.teachers = teachers;
        this.group = group;
        StudyList = new ArrayList<>();
    }

    public void addUsers(StudentRepository students, TeacherRepository teachers){
        for (Student student : students.getAll()) {
            if (student.getGroupId().equals(group.getGroupId())){
                StudyList.add(student);
            }

        }
        for (Teacher teacher: teachers.getAll()) {
            if (teacher.getGroupId().equals(group.getGroupId())){
                StudyList.add(teacher);
                break;
            }
        }
    }

    public List<User> getAll(){
        return StudyList;
    }
}