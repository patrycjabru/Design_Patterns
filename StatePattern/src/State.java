public abstract class State {
    protected AudioPlayer player;

    public State(AudioPlayer player) {
        this.player = player;
    }

    abstract void clickNext();
    abstract void clickPrevious();
}
