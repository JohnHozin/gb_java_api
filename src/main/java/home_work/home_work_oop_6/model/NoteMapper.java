package home_work.home_work_oop_6.model;

import home_work.home_work_oop_6.views.ViewNote;

import java.util.Arrays;
import java.util.List;

public class NoteMapper implements Mapper {
    public String map(Note note) {
        List<String> list = Arrays.asList(note.getId(), note.getHeader(), note.getText(), note.getDate());
        return String.join(ViewNote.divider, list);
    }

    public Note map(String line) {
        String[] lines = line.split("[.,;]");
        return new Note(lines[0], lines[1], lines[2], lines[3]);
    }
}