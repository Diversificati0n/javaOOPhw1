package notes;
import java.util.List;

public interface NoteManager {
    List<Note> getAllNotes();

    void createNote(String title, String text);

    void editNoteById(int id, String newTitle, String newText);

    void deleteNoteById(int id);

    Note getNoteById(int id);
}
