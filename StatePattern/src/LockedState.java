public class LockedState extends State{

    public LockedState(AudioPlayer player) {
        super(player);
    }

    @Override
    void clickNext() {
        System.out.println("Cannot switch song when locked");
    }

    @Override
    void clickPrevious() {
        System.out.println("Cannot switch song when locked");
    }
}
