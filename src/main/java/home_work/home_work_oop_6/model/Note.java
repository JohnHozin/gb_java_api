package home_work.home_work_oop_6.model;

import java.time.LocalDateTime;

public class Note {
    private String id = "";
    private String header;
    private String text;
    private String date;

    public Note(String header, String text) {
        this.header = header;
        this.text = text;
        this.date = LocalDateTime.now().toString().replace("T"," ");
    }

    public Note(String id, String header, String text, String date) {
        this(header, text);
        this.id = id;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return String.format("Идентификатор: %s\nЗаголовок: %s\nТекст: %s\nДата: %s", id, header, text, date);
    }
}