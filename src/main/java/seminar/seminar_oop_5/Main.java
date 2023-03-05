package seminar.seminar_oop_5;

import seminar.seminar_oop_5.controllers.UserController;
import seminar.seminar_oop_5.model.FileOperation;
import seminar.seminar_oop_5.model.FileOperationImpl;
import seminar.seminar_oop_5.model.Repository;
import seminar.seminar_oop_5.model.RepositoryFile;
import seminar.seminar_oop_5.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
