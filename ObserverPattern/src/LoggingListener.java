public class LoggingListener implements EventListener {
    @Override
    public void update(String filename) {
        System.out.println("LoggingListener: "+filename);
    }
}
