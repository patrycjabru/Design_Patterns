public class Radio implements Device {
    private boolean enabled = false;
    private int volume = 50;
    private int channel = 1;
    @Override
    public boolean isEnabled() {
        System.out.println("Radio isEnabled: "+enabled);
        return enabled;
    }

    @Override
    public void enable() {
        System.out.println("Radio enabled");
        enabled = true;
    }

    @Override
    public void disable() {
        System.out.println("Radio disabled");
        enabled = false;
    }

    @Override
    public int getVolume() {
        System.out.println("Radio volume: "+volume);
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
        System.out.println("Radio volume set: "+volume);
    }

    @Override
    public int getChannel() {
        System.out.println("Radio channel: "+channel);
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        if (channel<1)
            this.channel=1;
        else
            this.channel = channel;
        System.out.println("Radio channel set: "+channel);
    }
}
