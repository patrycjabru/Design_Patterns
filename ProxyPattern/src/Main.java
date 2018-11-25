public class Main {

    public static void main(String[] args) {
        ThirdPartyYoutubeLib service = new ThirdPartyYoutubeClass();
        CachedYoutubeClass proxy = new CachedYoutubeClass(service);
        YoutubeManager manager = new YoutubeManager(proxy);
        String input = "123";
        manager.reactOnUserInput(input);
        System.out.println("==================");
        manager.reactOnUserInput(input);
    }
}
