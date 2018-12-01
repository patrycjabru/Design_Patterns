public class Panel extends Container {
    String modalHelpText;

    public void showHelp() {
        if (modalHelpText != null)
            System.out.println("ModalHelp Panel: "+modalHelpText);
        else
            super.showHelp();
    }
}
