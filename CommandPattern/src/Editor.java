public class Editor {
    private String selectedText = "";

    public String getSelection() {
        return selectedText;
    }

    public void deleteSelection() {
        selectedText = "";
    }

    public void replaceSelection(String text) {
        this.selectedText = text;
    }
}
