package home_work.home_work_oop_6.model;

import seminar.seminar_oop_5.model.Mapper;
import seminar.seminar_oop_5.model.User;
import seminar.seminar_oop_5.views.ViewUser;

import java.util.Arrays;
import java.util.List;

public class UserMapper implements Mapper {
    public String map(seminar.seminar_oop_5.model.User user) {
        List<String> list = Arrays.asList(user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
        return String.join(ViewUser.divider, list);
    }

    public seminar.seminar_oop_5.model.User map(String line) {
        String[] lines = line.split("[.,;]");
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}