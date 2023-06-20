package Seminar5.HomeWork.controllers;

import Seminar5.HomeWork.model.Student;
import Seminar5.HomeWork.model.Teacher;
import Seminar5.HomeWork.model.User;
import Seminar5.HomeWork.repository.StudentRepository;
import Seminar5.HomeWork.repository.TeacherRepository;
import Seminar5.HomeWork.service.StudyGroupService;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupController {
    private final StudyGroupService groupService;

    public StudyGroupController(StudyGroupService groupService) {
        this.groupService = groupService;
    }

    public void addUsers(StudentRepository students, TeacherRepository teachers) {
        groupService.addUsers(students, teachers);
    }

    public List<User> getAll() {
        return groupService.getAll();
    }

    public List<User> getStudent() {
        List<User> students = new ArrayList<>();
        for (User user : groupService.getAll()) {
            if (user.getClass().equals(Student.class)) {
                students.add(user);
            }

        }
        return students;
    }

    public List<User> getTeacher() {
        List<User> teachers = new ArrayList<>();
        for (User user : groupService.getAll()) {
            if (user.getClass().equals(Teacher.class)) {
                teachers.add(user);
            }
        }
        return teachers;
    }
}