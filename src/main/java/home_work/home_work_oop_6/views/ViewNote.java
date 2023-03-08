package home_work.home_work_oop_6.views;

import home_work.home_work_oop_6.controllers.NoteController;
import home_work.home_work_oop_6.model.Note;

import java.util.List;
import java.util.Scanner;

public class ViewNote {

    private NoteController noteController;

    public ViewNote(NoteController noteController) {
        this.noteController = noteController;
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
                }
            } catch (Exception e) {
                System.out.println("Произошла ошибка, " + e.getMessage());
            }
        }
    }

    private void caseUpdate() {
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
    }

    private void caseDelete() {
        String id = prompt("Идентификатор пользователя: ");
        try {
            noteController.deleteNote(id);
            System.out.println("Запись удалена");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void caseCreate() throws Exception {
        String header = prompt("Заголовок: ");
        String text = prompt("Текст: ");
        noteController.saveNote(new Note(header, text));
    }

    private void caseRead() {
        String id = prompt("Идентификатор пользователя: ");
        try {
            Note note = noteController.readNote(id);
            System.out.println(note);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void caseList() {
        List<Note> noteList = noteController.readNotes();
        for (Note note : noteList) {
            System.out.println(note);
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
