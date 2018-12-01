public class Checkbox extends Component {
    public boolean checked = false;
    public Checkbox(Mediator dialog) {
        super(dialog);
    }

    public void check() {
        if (checked==true)
            checked=false;
        else
            checked=true;
        dialog.notify(this, "check");
    }

}
