package home_work.home_work_oop_7;

import home_work.home_work_oop_7.controllers.NoteController;
import home_work.home_work_oop_7.model.*;
import home_work.home_work_oop_7.views.ViewNote;
import home_work.home_work_oop_7.model.Logger;

public class Main {
    public static void main(String[] args) {

        Logger logger = new LoggerImpl("src/main/java/home_work/home_work_oop_7/resources/log.txt");
        FileOperation fileOperation = new FileOperationImpl("src/main/java/home_work/home_work_oop_7/resources/notes.txt", logger);
        Repository repository = new RepositoryFile(fileOperation, new NoteMapper(), logger);
        NoteController controller = new NoteController(repository);
        ViewNote view = new ViewNote(controller, logger);
        view.run();
    }
}
