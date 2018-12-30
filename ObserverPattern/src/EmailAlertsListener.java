public class EmailAlertsListener implements EventListener {
    @Override
    public void update(String filename) {
        System.out.println("EmailAlertsListener: "+filename);
    }
}
