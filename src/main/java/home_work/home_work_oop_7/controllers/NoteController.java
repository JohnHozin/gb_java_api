package home_work.home_work_oop_7.controllers;

import home_work.home_work_oop_7.model.Logger;
import home_work.home_work_oop_7.model.Note;
import home_work.home_work_oop_7.model.Repository;

import java.util.List;

public class NoteController {
    private final Repository repository;
    private Logger logger;

    public NoteController(Repository repository) {
        this.logger = repository.getLogger();
        logger.writeLogToFile("start constructor in NoteController");
        this.repository = repository;
        logger.writeLogToFile("end constructor in NoteController");

    }

    public void saveNote(Note note) throws Exception {
        logger.writeLogToFile("start method saveNote in NoteController");
        repository.CreateNote(note);
        logger.writeLogToFile("end method saveNote in NoteController");
    }

    public Note readNote(String noteId) throws Exception {
        logger.writeLogToFile("start method readNote in NoteController");
        List<Note> notes = repository.getAllNotes();
        for (Note note : notes) {
            if (note.getId().equals(noteId)) {
                logger.writeLogToFile("end method readNote in NoteController");
                return note;
            }
        }
        throw new Exception("Note not found");
    }

    public List<Note> readNotes(){
        logger.writeLogToFile("start method readNotes in NoteController");
        List<Note> notes = repository.getAllNotes();
        logger.writeLogToFile("end method readNotes in NoteController");
        return notes;
    }

    public void deleteNote(String noteId){
        logger.writeLogToFile("start method deleteNote in NoteController");
        repository.deleteNote(noteId);
        logger.writeLogToFile("end method deleteNote in NoteController");
    }

    public void updateNote(String noteId, Note note){
        logger.writeLogToFile("start method updateNote in NoteController");
        repository.updateNote(noteId, note);
        logger.writeLogToFile("end method updateNote in NoteController");
    }
}