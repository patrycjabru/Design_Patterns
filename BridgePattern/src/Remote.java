public class Remote {
    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled())
            device.disable();
        else
            device.enable();
    }

    public void volumeDown() {
        int volume = device.getVolume();
        device.setVolume(volume - 10);
    }

    public void volumeUp() {
        int volume = device.getVolume();
        device.setVolume(volume + 10);
    }

    public void channelDown() {
        int channel = device.getChannel();
        device.setChannel(channel - 1);
    }

    public void channelUp() {
        int channel = device.getChannel();
        device.setChannel(channel + 1);
    }
}
