public class PasteCommand extends Command{
    public PasteCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public void execute() {
        editor.replaceSelection(app.clipboard);
        System.out.println("Pasting "+app.clipboard);
    }
}
