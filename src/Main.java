public class Main {
    public static void main(String[] args) {
        NoteModel model = new NoteModel();
        NoteView view = new NoteView();
        NoteController controller = new NoteController(model, view);
        controller.run();

    }
}