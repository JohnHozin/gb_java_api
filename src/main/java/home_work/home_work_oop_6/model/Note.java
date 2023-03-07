package home_work.home_work_oop_6.model;

import java.time.LocalDateTime;

public class Note {
    private String id = "";
    private String header;
    private String text;
    private LocalDateTime date;

    public Note(String header, String text, LocalDateTime date) {
        this.header = header;
        this.text = text;
        this.date = LocalDateTime.now();
    }

    public Note(String id, String header, String text, LocalDateTime date) {
        this(header, text, date);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return header;
    }

    public void setFirstName(String header) {
        this.header = header;
    }

    public String getLastName() {
        return text;
    }

    public void setLastName(String text) {
        this.text = text;
    }

    public LocalDateTime getPhone() {
        return date;
    }

    @Override
    public String toString() {
        return String.format("Идентификатор: %s\nЗаголовок: %s\nТекст: %s\nДата: %s", id, header, text, date);
    }
}