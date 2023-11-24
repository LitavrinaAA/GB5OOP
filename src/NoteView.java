import java.util.List;
import java.util.Scanner;

public class NoteView {
    /*представлять представление (визуальное отображение) для блокнота.
    Этот класс должен иметь методы для вывода списка заметок,
    отображения одной заметки
    и получения пользовательского ввода для создания или редактирования заметок.
     */
    public <T> void printAllNotes(List<T> notes){
        for (int i = 0; i < notes.size(); i++) {
            System.out.println("id = " + i + " | запись = " + notes.get(i) );
        }

    }
    public void printNote(Note note) {
        System.out.println(note);
    }

    public String getUserInput(String mess) {
        Scanner in = new Scanner(System.in);
        System.out.println(mess);
        return in.next();
    }
    public void printMes(String mes) {
        System.out.println(mes);
    }

}
