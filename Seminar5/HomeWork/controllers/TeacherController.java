package Seminar5.HomeWork.controllers;

import Seminar5.HomeWork.model.Teacher;
import Seminar5.HomeWork.service.TeacherService;

import java.util.List;

public class TeacherController implements UserController<Teacher> {

    public final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String groupId) {
        teacherService.create(fullName, age, phoneNumber, groupId);
    }

    @Override
    public List<Teacher> getAllSortUsers() {
        return teacherService.getAllSortUsers();
    }

    @Override
    public List<Teacher> getAllSortUsersByFamilyName() {
        return teacherService.getAllSortUsersByFamilyName();
    }

    @Override
    public boolean removeUser(String fullName) {
        teacherService.removeUser(fullName);
        return true;
    }

    @Override
    public List<Teacher> getAll() {
        return teacherService.getAll();
    }

    @Override
    public List<Teacher> getAllSortUsersByAge() {
        return teacherService.getAllSortUsersByAge();
    }
    public boolean editTeacher(Long id){
        teacherService.editTeacher(id);
        return true;
    }
}