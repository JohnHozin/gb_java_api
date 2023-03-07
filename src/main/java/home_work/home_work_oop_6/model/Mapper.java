package home_work.home_work_oop_6.model;

import seminar.seminar_oop_5.model.User;

public interface Mapper {
    public String map(seminar.seminar_oop_5.model.User user);

    public User map(String user);
}
