public class Editor {
    public EventManager events = new EventManager();
    private String filename = "";

    public void openFile(String filename) {
        this.filename = filename;
        events.notify("open",filename);
    }

    public void saveFile() {
        events.notify("save",filename);
    }
}
