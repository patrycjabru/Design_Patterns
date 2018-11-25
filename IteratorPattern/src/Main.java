public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        Profile profile = new Profile("1");
        app.sendSpamToFriends(profile);

        app.sendSpamToFriends(profile);
    }
}
