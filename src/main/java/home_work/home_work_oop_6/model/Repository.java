package home_work.home_work_oop_6.model;

import seminar.seminar_oop_5.model.User;

import java.util.List;

public interface Repository {
    List<seminar.seminar_oop_5.model.User> getAllUsers();

    String CreateUser(seminar.seminar_oop_5.model.User user);

    void deleteUser(String userId);

    void updateUser(String userId, User user);

    void changeDivider();
}