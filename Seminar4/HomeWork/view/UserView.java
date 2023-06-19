package Seminar4.HomeWork.view;

import Seminar4.HomeWork.model.User;

public interface UserView<T extends User> {
    void sendOnConsole(String sortType); //GET
    void create(String fullName, Integer age, String phoneNumber); //POST
    void removeUser(String fullName); //DELETE
    void edit(Long id);
}
