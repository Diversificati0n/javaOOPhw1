package notes;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileNoteManager implements NoteManager {
    private String storageFile;

    public FileNoteManager(String storageFile) {
        this.storageFile = storageFile;
    }

    @Override
    public List<Note> getAllNotes() {
        List<Note> notes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(storageFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String title = parts[1];
                String text = parts[2];
                notes.add(new Note(id, title, text));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return notes;
    }

    @Override
    public void createNote(String title, String text) {
        int id = getNextId();
        Note note = new Note(id, title, text);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(storageFile, true))) {
            writer.write(noteToString(note));
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void editNoteById(int id, String newTitle, String newText) {
        List<Note> notes = getAllNotes();
        for (int i = 0; i < notes.size(); i++) {
            Note note = notes.get(i);
            if (note.getId() == id) {
                notes.set(i, new Note(id, newTitle, newText));
                break;
            }
        }
        saveAllNotes(notes);
    }

    @Override
    public void deleteNoteById(int id) {
        List<Note> notes = getAllNotes();
        notes.removeIf(note -> note.getId() == id);
        saveAllNotes(notes);
    }

    @Override
    public Note getNoteById(int id) {
        List<Note> notes = getAllNotes();
        for (Note note : notes) {
            if (note.getId() == id) {
                return note;
            }
        }
        return null;
    }

    private int getNextId() {
        List<Note> notes = getAllNotes();
        if (notes.isEmpty()) {
            return 1;
        } else {
            return notes.get(notes.size() - 1).getId() + 1;
        }
    }

    private void saveAllNotes(List<Note> notes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(storageFile))) {
            for (Note note : notes) {
                writer.write(noteToString(note));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String noteToString(Note note) {
        return note.getId() + "," + note.getTitle() + "," + note.getText();
    }
}
