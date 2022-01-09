package com.geektech.lesson_6;

public class Model {
    private String number;
    private String  author;
    private String song;
    private String time;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Model(String number, String author, String song, String time) {
        this.number = number;
        this.author = author;
        this.song = song;
        this.time = time;


    }
}
