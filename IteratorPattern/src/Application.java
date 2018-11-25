public class Application {
    private SocialNetwork network;
    private SocialSpammer spammer;

    public Application() {
        network = new Facebook();
        spammer = new SocialSpammer();
    }

    public void sendSpamToFriends(Profile profile) {
        ProfileIterator iterator = network.createFriendsIterator(profile.profileId);
        spammer.send(iterator,"Test message");
    }

    public void sendSpamToCoworkers(Profile profile) {
        ProfileIterator iterator = network.createCoworkersIterator(profile.profileId);
        spammer.send(iterator,"Test message2");
    }
}
