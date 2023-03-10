package home_work.home_work_oop_7.model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {
    private Mapper mapper;
    private FileOperation fileOperation;
    private Logger logger;

    public RepositoryFile(FileOperation fileOperation, Mapper mapper, Logger logger) {
        this.logger = logger;
        logger.writeLogToFile("start constructor in RepositoryFile");
        this.fileOperation = fileOperation;
        this.mapper = mapper;
        logger.writeLogToFile("end constructor in RepositoryFile");
    }

    @Override
    public List<Note> getAllNotes() {
        logger.writeLogToFile("start method getAllNotes in RepositoryFile");
        List<String> lines = fileOperation.readAllLines();
        List<Note> notes = new ArrayList<>();
        for (String line : lines) {
            notes.add(mapper.map(line));
        }
        logger.writeLogToFile("end method getAllNotes in RepositoryFile");
        return notes;
    }

    @Override
    public String CreateNote(Note note) {
        logger.writeLogToFile("start method CreateNote in RepositoryFile");
        List<Note> notes = getAllNotes();
        int max = 0;
        for (Note item : notes) {
            int id = Integer.parseInt(item.getId());
            if (max < id) {
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        note.setId(id);
        notes.add(note);
        saveRepository(notes);
        logger.writeLogToFile("end method CreateNote in RepositoryFile");
        return id;
    }

    private void saveRepository(List<Note> notes) {
        logger.writeLogToFile("start method saveRepository in RepositoryFile");
        List<String> lines = new ArrayList<>();
        for (Note item : notes) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
        logger.writeLogToFile("end method saveRepository in RepositoryFile");
    }

    @Override
    public void deleteNote(String noteId) {
        logger.writeLogToFile("start method deleteNote in RepositoryFile");
        List<Note> notes = getAllNotes();
        Note foundNote = null;
        for (Note note : notes) {
            if (note.getId().equals(noteId)) {
                foundNote = note;
            }
        }
        if (foundNote != null) {
            notes.remove(foundNote);
        }
        saveRepository(notes);
        logger.writeLogToFile("end method deleteNote in RepositoryFile");
    }

    @Override
    public void updateNote(String noteId, Note updateNote) {
        logger.writeLogToFile("start method updateNote in RepositoryFile");
        List<Note> notes = getAllNotes();
        Note foundNote = null;
        for (Note note : notes) {
            if (note.getId().equals(noteId)) {
                foundNote = note;
            }
        }
        if (foundNote != null) {
            notes.remove(foundNote);
            updateNote.setId(noteId);
            notes.add(updateNote);
            saveRepository(notes);
        }
        logger.writeLogToFile("start method updateNote in RepositoryFile");
    }

    @Override
    public Logger getLogger() {
        return logger;
    }
}