public class Dialog extends Container {
    String wikiPageUrl;

    public void showHelp() {
        if (wikiPageUrl != null)
            System.out.println("WikiPage Dialog: "+wikiPageUrl);
        else
            super.showHelp();
    }
}
