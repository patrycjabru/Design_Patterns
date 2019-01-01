public class CutCommand extends Command {
    public CutCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public void execute() {
        app.clipboard = editor.getSelection();
        editor.deleteSelection();
        System.out.println("Cutting "+app.clipboard);
    }
}
