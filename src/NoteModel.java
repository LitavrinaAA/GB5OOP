import java.util.ArrayList;
import java.util.List;

public class NoteModel {
    /*будет представлять модель для хранения заметок.
    Каждая заметка должна иметь уникальный идентификатор, заголовок и текст.
     */

    private int id;
    private List<Note> notes;

    public NoteModel() {
        notes = new ArrayList<>();
    }
    public List<Note> getAllNotes() {
        return notes;
    }
    public List<String> getAllNotesTitles(){
        List<String> noteTitles = new ArrayList<>();
        for (Note n: notes) {
            noteTitles.add(n.getTitle());
        }
        return noteTitles;
    }
    public Note getNote(int index) {
        return notes.get(index);
    }
    public void addNote(String title, String text) {
        notes.add(new Note(title, text));
    }
    public void removeNote(int index) {
        if (index >=0 && index < notes.size()) {
            notes.remove(index);
        }
    }
    public void setNoteTitle(int index, String title) {
        if (index >=0 && index < notes.size()) {
//            Note note = notes.get(index);
//            note.setTitle(title);
            notes.set(index,  notes.get(index).setTitle(title));
        }
    }
    public void setNoteText(int index, String text) {
        if (index >=0 && index < notes.size()) {
//            Note note = notes.get(index);
//            note.setTitle(text);
            notes.set(index,  notes.get(index).setText(text));
        }
    }


}
