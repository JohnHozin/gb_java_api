package home_work.home_work_oop_6.model;

import seminar.seminar_oop_5.model.FileOperation;
import seminar.seminar_oop_5.model.Mapper;
import seminar.seminar_oop_5.model.Repository;
import seminar.seminar_oop_5.model.User;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {
    private seminar.seminar_oop_5.model.Mapper mapper;
    private seminar.seminar_oop_5.model.FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation, Mapper mapper) {
        this.fileOperation = fileOperation;
        this.mapper = mapper;
    }

    @Override
    public List<seminar.seminar_oop_5.model.User> getAllUsers() {
        List<String> lines = fileOperation.readAllLines();
        List<seminar.seminar_oop_5.model.User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.map(line));
        }
        return users;
    }

    @Override
    public String CreateUser(seminar.seminar_oop_5.model.User user) {

        List<seminar.seminar_oop_5.model.User> users = getAllUsers();
        int max = 0;
        for (seminar.seminar_oop_5.model.User item : users) {
            int id = Integer.parseInt(item.getId());
            if (max < id) {
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        user.setId(id);
        users.add(user);
        saveRepository(users);
        return id;
    }

    private void saveRepository(List<seminar.seminar_oop_5.model.User> users) {
        List<String> lines = new ArrayList<>();
        for (seminar.seminar_oop_5.model.User item : users) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
    }

    @Override
    public void deleteUser(String userId) {
        List<seminar.seminar_oop_5.model.User> users = getAllUsers();

        seminar.seminar_oop_5.model.User foundUser = null;
        for (seminar.seminar_oop_5.model.User user : users) {
            if (user.getId().equals(userId)) {
                foundUser = user;
            }
        }
        if (foundUser != null) {
            users.remove(foundUser);
        }
        saveRepository(users);

    }

    @Override
    public void updateUser(String userId, seminar.seminar_oop_5.model.User updateUser){
        List<seminar.seminar_oop_5.model.User> users = getAllUsers();

        seminar.seminar_oop_5.model.User foundUser = null;
        for (seminar.seminar_oop_5.model.User user : users) {
            if (user.getId().equals(userId)) {
                foundUser = user;
            }
        }
        if (foundUser != null) {
            users.remove(foundUser);
            updateUser.setId(userId);
            users.add(updateUser);
            saveRepository(users);
        }
    }

    @Override
    public void changeDivider() {
        List<User> users = getAllUsers();
        saveRepository(users);
    }
}