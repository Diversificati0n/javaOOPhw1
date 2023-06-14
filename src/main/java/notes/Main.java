package notes;
import java.util.Scanner;

public class Main {
    private static final String StorageFile = "notes.txt";
    private static final NoteManager noteManager = new FileNoteManager(StorageFile);
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Записки");
            System.out.println("1. Просмотреть все записки");
            System.out.println("2. Создать новую записку");
            System.out.println("3. Отредактировать записку");
            System.out.println("4. Удалить записку");
            System.out.println("5. Просмотреть записку по ID");
            System.out.println("0. Выход");
            System.out.println("------------------------------");

            int choice = readIntInput("Выберите действие: ");

            switch (choice) {
                case 1:
                    viewAllNotes();
                    break;
                case 2:
                    createNote();
                    break;
                case 3:
                    editNote();
                    break;
                case 4:
                    deleteNote();
                    break;
                case 5:
                    viewNoteById();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Ошибка, некорректный ввод");
                    break;
            }
        }

        scanner.close();
    }

    private static void viewAllNotes() {
        System.out.println("Все записки");
        noteManager.getAllNotes().forEach(System.out::println);
        System.out.println("------------------------------");
    }

    private static void createNote() {
        System.out.println("Создание записки");
        String title = readStringInput("Введите заголовок: ");
        String text = readStringInput("Введите текст: ");
        noteManager.createNote(title, text);
        System.out.println("Записка создана");
        System.out.println("------------------------------");
    }

    private static void editNote() {
        System.out.println("Редактирование записки");
        int id = readIntInput("Введите ID записки для редактирования: ");
        String newTitle = readStringInput("Введите новый заголовок: ");
        String newText = readStringInput("Введите новый текст: ");
        noteManager.editNoteById(id, newTitle, newText);
        System.out.println("Записка отредактирована");
        System.out.println("------------------------------");
    }

    private static void deleteNote() {
        System.out.println("Удаление записки");
        int id = readIntInput("Введите ID записки для удаления: ");
        noteManager.deleteNoteById(id);
        System.out.println("Записка удалена");
        System.out.println("------------------------------");
    }

    private static void viewNoteById() {
        System.out.println("Просмотр записки по ID");
        int id = readIntInput("Введите ID записки: ");
        Note note = noteManager.getNoteById(id);
        if (note != null) {
            System.out.println(note);
        } else {
            System.out.println("Записка не найдена");
        }
        System.out.println("------------------------------");
    }

    private static int readIntInput(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print("Некорректный ввод. Повторите попытку: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static String readStringInput(String message) {
        System.out.print(message);
        return scanner.next();
    }
}
