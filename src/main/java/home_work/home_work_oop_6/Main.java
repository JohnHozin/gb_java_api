package home_work.home_work_oop_6;

import seminar.seminar_oop_5.controllers.UserController;
import seminar.seminar_oop_5.model.*;
import seminar.seminar_oop_5.views.ViewUser;

/**
 * Написать проект, "Записки", содержащий работу с записками из консоли (можно прочитать все записки, создать одну
 * записку, отредактировать записку, удалить, и прочитать одну записку по ID), записка содержит в себе как минимум
 * 3 поля Id, заголовок и текст, можно добавить дату. Хранение по вашему выбору, можно в текстовом файле (или каждая
 * записка в одном файле, как вам удобнее). Можно сделать по аналогии с программой из 5 урока. Если все не успеете, то
 * часть задания можно перенести на следующий урок.
 */

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("src/main/java/home_work/home_work_oop_6/resources/users.json");
        Repository repository = new RepositoryFile(fileOperation, new UserMapper());
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
