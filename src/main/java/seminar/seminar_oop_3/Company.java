package seminar.seminar_oop_3;

import java.util.*;

public class Company implements Iterable<User> {
    private User user;

    public Company(User user) {
        this.user = user;
    }

    private List<User> getSubUsersDeep(User user) {
        List<User> users = new ArrayList<>();
        users.add(user);
        if (!user.getPersonal().iterator().hasNext()) {
            return users;
        }
        for (User subUser : user.getPersonal()) {
            users.addAll(getSubUsersDeep(subUser));
        }
        return users;
    }

    private List<User> getSubUsersWide(User user) {
        List<User> users = new ArrayList<>();
        Queue<User> userQueue = new ArrayDeque<>();
//        userQueue.add(user);
        userQueue.offer(user);
        while (userQueue.size() > 0) {
            User userItem = userQueue.poll();
            users.add(userItem);
            for (User subUser : userItem.getPersonal()) {
                userQueue.add(subUser);
            }
        }
        return users;
    }

    @Override
    public Iterator<User> iterator() {
//        List<User> users = getSubUsersDeep(user);
        List<User> users = getSubUsersWide(user);
        return users.iterator();
    }
}
