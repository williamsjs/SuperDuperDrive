package com.udacity.jwdnd.course1.cloudstorage.model;

public class Note implements DefaultModel {

    private int noteId;

    private String noteTitle;

    private String noteDescription;

    private int userId;

    public int getId() {
        return noteId;
    }

    public void setId(int noteId) {
        this.noteId = noteId;
    }

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteDescription() {
        return noteDescription;
    }

    public void setNoteDescription(String noteDescription) {
        this.noteDescription = noteDescription;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}