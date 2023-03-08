package home_work.home_work_oop_6;

import home_work.home_work_oop_6.controllers.NoteController;
import home_work.home_work_oop_6.model.*;
import home_work.home_work_oop_6.views.ViewNote;

/**
 * Написать проект, "Записки", содержащий работу с записками из консоли (можно прочитать все записки, создать одну
 * записку, отредактировать записку, удалить, и прочитать одну записку по ID), записка содержит в себе как минимум
 * 3 поля Id, заголовок и текст, можно добавить дату. Хранение по вашему выбору, можно в текстовом файле (или каждая
 * записка в одном файле, как вам удобнее). Можно сделать по аналогии с программой из 5 урока. Если все не успеете, то
 * часть задания можно перенести на следующий урок.
 */

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("src/main/java/home_work/home_work_oop_6/resources/notes.txt");
        Repository repository = new RepositoryFile(fileOperation, new NoteMapper());
        NoteController controller = new NoteController(repository);
        ViewNote view = new ViewNote(controller);
        view.run();
    }
}
