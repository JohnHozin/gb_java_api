package home_work.home_work_oop_7.views;

import home_work.home_work_oop_7.controllers.NoteController;
import home_work.home_work_oop_7.model.Logger;
import home_work.home_work_oop_7.model.Note;

import java.util.List;
import java.util.Scanner;

public class ViewNote {

    private Logger logger;
    private NoteController noteController;

    public ViewNote(NoteController noteController, Logger logger) {
        this.noteController = noteController;
        this.logger = logger;

    }

    public static String divider = "~";

    public void run() {
        logger.writeLogToFile("start method run in ViewNote");
        Commands com = Commands.NONE;

        while (true) {
            try {
                String command = prompt("Введите команду: ");
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) {
                    logger.writeLogToFile("close program\n");
                    return;
                }
                switch (com) {
                    case CREATE:
                        logger.writeLogToFile("start operation CREATE");
                        caseCreate();
                        logger.writeLogToFile("end operation CREATE");
                        break;
                    case READ:
                        logger.writeLogToFile("start operation READ");
                        caseRead();
                        logger.writeLogToFile("end operation READ");
                        break;
                    case LIST:
                        logger.writeLogToFile("start operation LIST");
                        caseList();
                        logger.writeLogToFile("end operation LIST");
                        break;
                    case DELETE:
                        logger.writeLogToFile("start operation DELETE");
                        caseDelete();
                        logger.writeLogToFile("end operation DELETE");
                        break;
                    case UPDATE:
                        logger.writeLogToFile("start operation UPDATE");
                        caseUpdate();
                        logger.writeLogToFile("end operation UPDATE");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Произошла ошибка, " + e.getMessage());
            }
            logger.writeLogToFile("end method run in ViewNote");
        }
    }

    private void caseUpdate() {
        logger.writeLogToFile("start method caseUpdate in ViewNote");
        String id = prompt("Идентификатор пользователя: ");
        try {
            Note note = noteController.readNote(id);
            System.out.println("Заголовок: " + note.getHeader());
            String firstName = prompt("Заголовок: ");
            System.out.println("Текст: " + note.getText());
            String lastName = prompt("Текст: ");
            noteController.updateNote(id, new Note(firstName, lastName));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        logger.writeLogToFile("end method caseUpdate in ViewNote");
    }

    private void caseDelete() {
        logger.writeLogToFile("start method caseDelete in ViewNote");
        String id = prompt("Идентификатор пользователя: ");
        try {
            noteController.deleteNote(id);
            System.out.println("Запись удалена");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        logger.writeLogToFile("end method caseDelete in ViewNote");
    }

    private void caseCreate() throws Exception {
        logger.writeLogToFile("start method caseCreate in ViewNote");
        String header = prompt("Заголовок: ");
        String text = prompt("Текст: ");
        noteController.saveNote(new Note(header, text));
        logger.writeLogToFile("end method caseCreate in ViewNote");
    }

    private void caseRead() {
        logger.writeLogToFile("start method caseRead in ViewNote");
        String id = prompt("Идентификатор пользователя: ");
        try {
            Note note = noteController.readNote(id);
            System.out.println(note);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        logger.writeLogToFile("end method caseRead in ViewNote");
    }

    private void caseList() {
        logger.writeLogToFile("start method caseList in ViewNote");
        List<Note> noteList = noteController.readNotes();
        for (Note note : noteList) {
            System.out.println(note);
        }
        logger.writeLogToFile("end method caseList in ViewNote");
    }

    private String prompt(String message) {
        logger.writeLogToFile("start method prompt in ViewNote");
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        logger.writeLogToFile("end method prompt in ViewNote");
        return in.nextLine();
    }
}
