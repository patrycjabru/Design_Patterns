public class AudioPlayer {
    private State state;
    public int songNumber;

    public AudioPlayer() {
        songNumber = 1;
        state = new ReadyState(this);
    }

    public void clickNext() {
        state.clickNext();
    }

    public void clickPrevious() {
        state.clickPrevious();
    }

    public void changeState(State state) {
        this.state = state;
    }
}
