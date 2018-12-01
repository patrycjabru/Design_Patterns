public class Main {

    public static void main(String[] args) {
        AuthenticationDialog dialog = new AuthenticationDialog();
        dialog.loginOrRegisterBox = new Checkbox(dialog);
        dialog.cancelBtn = new Button(dialog);
        dialog.okBtn = new Button(dialog);

        dialog.okBtn.click();

        dialog.loginOrRegisterBox.check();
        dialog.okBtn.click();
    }
}
