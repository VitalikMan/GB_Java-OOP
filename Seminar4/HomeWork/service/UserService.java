package Seminar4.HomeWork.service;

import Seminar4.HomeWork.model.Teacher;
import Seminar4.HomeWork.model.User;

import java.util.List;

public interface UserService<T extends User> {
    void create(String fullName, Integer age, String phoneNumber);
    List<T> getAll();
    List<T> getAllSortUsers();
    List<T> getAllSortUsersByFamilyName();
    List<T> getAllSortUsersByAge();
    void removeUser(String fullName);
    void edit(Long id);
}
