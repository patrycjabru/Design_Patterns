public class Main {

    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.clickNext();
        player.clickNext();
        player.clickPrevious();

        player.changeState(new LockedState(player));
        player.clickNext();
        player.clickPrevious();
    }
}
