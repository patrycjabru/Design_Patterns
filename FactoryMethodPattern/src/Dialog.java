public abstract class Dialog {
    void renderWindow() {
        Button okButton = createButton();
        okButton.onClick("closeDialog");
        okButton.onHold("showHint");
        okButton.render();
    }
    abstract Button createButton();

}
