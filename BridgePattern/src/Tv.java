public class Tv implements Device {
    private boolean enabled = false;
    private int volume = 50;
    private int channel = 1;
    @Override
    public boolean isEnabled() {
        System.out.println("Tv isEnabled: "+enabled);
        return enabled;
    }

    @Override
    public void enable() {
        System.out.println("Tv enabled");
        enabled = true;
    }

    @Override
    public void disable() {
        System.out.println("Tv disabled");
        enabled = false;
    }

    @Override
    public int getVolume() {
        System.out.println("Tv volume: "+volume);
        return 0;
    }

    @Override
    public void setVolume(int percent) {
        if (percent > 100)
            volume = 100;
        else if (percent < 0)
            volume = 0;
        else
            volume = percent;
        System.out.println("Tv volume set: "+volume);
    }

    @Override
    public int getChannel() {
        System.out.println("Tv channel: "+channel);
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        if (channel<1)
            this.channel=1;
        else
            this.channel = channel;
        System.out.println("Tv channel set: "+channel);
    }
}
