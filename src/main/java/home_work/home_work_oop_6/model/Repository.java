package home_work.home_work_oop_6.model;

import java.util.List;

public interface Repository {
    List<Note> getAllNotes();

    String CreateNote(Note note);

    void deleteNote(String noteId);

    void updateNote(String noteId, Note note);

}