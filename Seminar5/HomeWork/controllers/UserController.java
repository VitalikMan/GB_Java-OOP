package Seminar5.HomeWork.controllers;

import Seminar5.HomeWork.model.User;

import java.util.List;

public interface UserController<T extends User> {

    void create(String fullName, Integer age, String phoneNumber, String groupId);
    List<T> getAll();
    List<T> getAllSortUsers();
    List<T> getAllSortUsersByFamilyName();
    List<T> getAllSortUsersByAge();
    boolean removeUser(String fullName);
}