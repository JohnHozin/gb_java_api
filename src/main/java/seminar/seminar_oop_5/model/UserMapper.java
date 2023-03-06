package seminar.seminar_oop_5.model;

import seminar.seminar_oop_5.views.ViewUser;

import java.util.Arrays;
import java.util.List;

public class UserMapper implements Mapper {
    public String map(User user) {
        List<String> list = Arrays.asList(user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
        return String.join(ViewUser.divider, list);
    }

    public User map(String line) {
        String[] lines = line.split("[.,;]");
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}