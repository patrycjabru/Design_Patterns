public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        EventListener logggingListener = new LoggingListener();
        EventListener emailAlertsListener = new EmailAlertsListener();

        editor.events.subscribe("open",logggingListener);
        editor.events.subscribe("save",emailAlertsListener);

        editor.openFile("file1");
        editor.saveFile();
    }
}
