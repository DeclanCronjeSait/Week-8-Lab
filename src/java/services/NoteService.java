package services;

import database.NotesDB;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import models.Note;
import java.util.List;

public class NoteService {

    private NotesDB noteDB;

    public NoteService() {
        noteDB = new NotesDB();
    }

    public Note get(int noteId) throws Exception {
        return noteDB.getNote(noteId);
    }

    public List<Note> getAll() throws Exception {
        return noteDB.getAll();
    }

    public int update(int noteId, String content) throws Exception {
        Date date = Calendar.getInstance().getTime();
        Note note = new Note(noteId, date, content);
        return noteDB.update(note);
    }

    public int delete(int noteId) throws Exception {
        Note deletednote = noteDB.getNote(noteId);
        return noteDB.delete(deletednote);
    }

    public int insert(String content) throws Exception {
        Date date = Calendar.getInstance().getTime();
        Note note = new Note(0, date, content);
        System.out.println("here");
        return noteDB.insert(note);
    }
}
