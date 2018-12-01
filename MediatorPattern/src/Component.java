public class Component {
    Mediator dialog;

    public Component(Mediator dialog) {
        this.dialog = dialog;
    }

    void click() {
        dialog.notify(this, "click");
    }

    void keypressed() {
        dialog.notify(this, "keypressed");
    }
}
