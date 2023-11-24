public class NoteController {
    /*управлять взаимодействием между моделью NoteModel и представлением NoteView.
    Этот класс должен иметь методы для добавления новых заметок,
    редактирования существующих заметок,
    удаления заметок и отображения списка заметок.
     */

    private NoteModel model;
    private NoteView view;

    public NoteController(NoteModel model, NoteView view) {
        this.model = model;
        this.view = view;
    }

    public void add() {
        model.addNote(view.getUserInput("Введите заголовок:")
                , view.getUserInput("Введите текст: "));

    }

    public void remove() {
        getAllNotes();
        model.removeNote(Integer.parseInt(view.getUserInput("Введите id записи для редактирования:")));

    }

    public void set() {
        view.printAllNotes(model.getAllNotesTitles());
        int id = Integer.parseInt(view.getUserInput("Введите id записи:"));

        if (view.getUserInput("Вы хотите изменить заголовок? y/n:").equals("y")) {
            model.setNoteTitle(id, view.getUserInput("Введите новый заголовок:"));
            view.printMes("Заголовок изменен");
        }

        if (view.getUserInput("Вы хотите изменить текст? y/n:").equals("y")) {
            model.setNoteText(id, view.getUserInput("Введите новый текст:"));
            view.printMes("Текст изменен");
        }

    }

    public void getNote() {
        view.printAllNotes(model.getAllNotesTitles());
        view.printNote(model.getNote(Integer.parseInt(view.getUserInput("Введите id записи:"))));
    }

    public void getAllNotes() {
        view.printAllNotes(model.getAllNotes());
    }

    public void getAllNotesTitles() {
        view.printAllNotes(model.getAllNotesTitles());
    }

    public void run() {
        while (true) {
            String action = view.getUserInput("Что вы хотите? " +
                    " (a - add, r-remove, s - set, g - get, al - get All)");

            switch (action) {
                case "a":
                    add();
                    break;
                case "r":
                    remove();
                    break;
                case "s":
                    set();
                    break;
                case "g":
                    getNote();
                    break;
                case "al":
                    getAllNotes();
                    break;
                case "exit":
                    return;
            }

        }
    }

}
