package seminar.seminar_oop_5;

import seminar.seminar_oop_5.controllers.UserController;
import seminar.seminar_oop_5.model.*;
import seminar.seminar_oop_5.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("src/main/java/seminar/seminar_oop_5/resources/asdasd.txt");
        Repository repository = new RepositoryFile(fileOperation, new UserMapper());
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
