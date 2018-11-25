public class SocialSpammer {
    public void send(ProfileIterator iterator, String message) {
        Profile profile = null;
        System.out.println("In SocialSpammer");
        while (iterator.hasMore()) {
            profile = iterator.getNext();
            System.out.println("Sends message: " + message + ", to " + profile.profileId);
        }
    }
}
