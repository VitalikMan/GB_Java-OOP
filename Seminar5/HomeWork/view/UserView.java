package Seminar5.HomeWork.view;

import Seminar5.HomeWork.model.User;

public interface UserView<T extends User> {

    void sendOnConsole(String sortType); //GET
    void create(String fullName, Integer age, String phoneNumber, String groupId); //POST
    void removeUser(String fullName); //DELETE
}
