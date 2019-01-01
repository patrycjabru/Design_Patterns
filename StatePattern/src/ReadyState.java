public class ReadyState extends State {
    public ReadyState(AudioPlayer player) {
        super(player);
    }

    @Override
    void clickNext() {
        player.songNumber++;
        System.out.println("Song number increased "+player.songNumber);
    }

    @Override
    void clickPrevious() {
        player.songNumber--;
        System.out.println("Song number decreased "+player.songNumber);
    }
}
