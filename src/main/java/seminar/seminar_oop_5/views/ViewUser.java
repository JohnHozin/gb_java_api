package seminar.seminar_oop_5.views;

import seminar.seminar_oop_5.controllers.UserController;
import seminar.seminar_oop_5.model.User;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public static String divider = ",";

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            try {
                String command = prompt("Введите команду: ");
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        caseCreate();
                        break;
                    case READ:
                        caseRead();
                        break;
                    case LIST:
                        caseList();
                        break;
                    case DELETE:
                        caseDelete();
                        break;
                    case UPDATE:
                        caseUpdate();
                        break;
                    case DIVIDER:
                        caseDivider();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Произошла ошибка, " + e.getMessage());
            }
        }
    }

    private void caseDivider() {
        String choice = prompt("1) .\n2) ,\n3) ;\nВыберете разделитель: ");
        switch (choice){
            case "1":
                divider = ".";
                break;
            case "3":
                divider = ";";
                break;
            default:
                divider = ",";
                break;
        }
        userController.changeDivider();
    }

    private void caseUpdate() {
        String id = prompt("Идентификатор пользователя: ");
        try {
            User user = userController.readUser(id);
            System.out.println("Имя: " + user.getFirstName());
            String firstName = prompt("Имя: ");
            System.out.println("Фамилия: " + user.getLastName());
            String lastName = prompt("Фамилия: ");
            System.out.println("Номер телефона: " + user.getPhone());
            String phone = prompt("Номер телефона: ");
            /**   можно создать нового юзера, а старого удалить. Идентификатор изменится          **/
//                            userController.saveUser(new User(firstName, lastName, phone));
//                            userController.deleteUser(id);
            /**   можно сохранить идентификатор, но запись сместится в конец   **/
            userController.updateUser(id, new User(firstName, lastName, phone));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void caseDelete() {
        String id = prompt("Идентификатор пользователя: ");
        try {
            userController.deleteUser(id);
            System.out.println("пользователь удалён");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void caseCreate() throws Exception {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        userController.saveUser(new User(firstName, lastName, phone));
    }

    private void caseRead() {
        String id = prompt("Идентификатор пользователя: ");
        try {
            User user = userController.readUser(id);
            System.out.println(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void caseList() {
        List<User> usersList = userController.readUsers();
        for (User user : usersList) {
            System.out.println(user);
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
