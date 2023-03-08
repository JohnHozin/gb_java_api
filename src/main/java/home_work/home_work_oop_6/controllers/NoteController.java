package home_work.home_work_oop_6.controllers;

import home_work.home_work_oop_6.model.Note;
import home_work.home_work_oop_6.model.Repository;

import java.util.List;

public class NoteController {
    private final Repository repository;

    public NoteController(Repository repository) {
        this.repository = repository;
    }

    public void saveNote(Note note) throws Exception {
        repository.CreateNote(note);
    }

    public Note readNote(String noteId) throws Exception {
        List<Note> notes = repository.getAllNotes();
        for (Note note : notes) {
            if (note.getId().equals(noteId)) {
                return note;
            }
        }
        throw new Exception("Note not found");
    }

    public List<Note> readNotes(){
        List<Note> notes = repository.getAllNotes();
        return notes;
    }

    public void deleteNote(String noteId){
        repository.deleteNote(noteId);
    }

    public void updateNote(String noteId, Note note){
        repository.updateNote(noteId, note);
    }
}