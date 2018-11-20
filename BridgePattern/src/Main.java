public class Main {

    public static void main(String[] args) {
        Tv tv = new Tv();
        Remote remote = new Remote(tv);
        remote.togglePower();

        Radio radio = new Radio();
        AdvancedRemote aRemote = new AdvancedRemote(radio);
        aRemote.togglePower();
        aRemote.channelUp();
        aRemote.volumeUp();
        aRemote.mute();
    }
}
