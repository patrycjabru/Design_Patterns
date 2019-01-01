public class Application {
    public String clipboard = "";

    public void run() {
        Editor editor = new Editor();
        CutCommand cut = new CutCommand(this, editor);
        CopyCommand copy = new CopyCommand(this, editor);
        PasteCommand paste = new PasteCommand(this, editor);

        editor.replaceSelection("test1");
        cut.execute();

        editor.replaceSelection("test2");
        copy.execute();

        editor.replaceSelection("test3");
        paste.execute();


    }
}
