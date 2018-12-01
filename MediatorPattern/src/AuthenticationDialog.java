public class AuthenticationDialog implements Mediator {
    public String title;
    public Checkbox loginOrRegisterBox;
    public Textbox loginUsername;
    public Textbox loginPassword;
    public Textbox registrationUsername;
    public Textbox registrationPassword;
    public Textbox registrationEmail;
    public Button okBtn;
    public Button cancelBtn;

    @Override
    public void notify(Component sender, String event) {
        if (sender == loginOrRegisterBox && event.equals("check")) {
            if (loginOrRegisterBox.checked)
                System.out.println("Show log in components");
            else
                System.out.println("Show registration components");
        }

        if(sender == okBtn && event.equals("click")) {
            if (loginOrRegisterBox.checked)
                System.out.println("Check login credentials");
            else
                System.out.println("Register new user");
        }
    }
}
