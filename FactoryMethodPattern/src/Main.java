public class Main {
    private static Dialog dialog;
    public static void main(String[] args) throws Exception {
        initialize("Red");
        dialog.renderWindow();

    }
    private static void initialize(String dialogType) throws Exception {
        if (dialogType.equals("Blue"))
            dialog = new BlueDialog();
        else if (dialogType.equals("Red"))
            dialog = new RedDialog();
        else
            throw new Exception("Unknown type");
    }
}
