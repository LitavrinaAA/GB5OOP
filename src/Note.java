public class Note {

    private String title;
    private String text;

    public Note( String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public Note setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getText() {
        return text;
    }

    public Note setText(String text) {
        this.text = text;
        return this;
    }

    @Override
    public String toString() {
        return "Note{" +
                " title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
