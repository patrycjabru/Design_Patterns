public class Main {

    public static void main(String[] args) {
        Dialog dialog = new Dialog();
        dialog.wikiPageUrl = "www.wikipage.com";
        Panel panel = new Panel();
        panel.modalHelpText = "Help1";
        Panel panel2 = new Panel();
        panel2.modalHelpText = "Help2";
        Panel panel3 = new Panel();

        dialog.add(panel);
        dialog.add(panel2);
        dialog.add(panel3);


        panel.showHelp();
        panel2.showHelp();
        panel3.showHelp();
        dialog.showHelp();
    }
}
