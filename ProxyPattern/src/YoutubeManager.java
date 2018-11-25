import java.util.ArrayList;

public class YoutubeManager {
    private ThirdPartyYoutubeLib service;

    public YoutubeManager(ThirdPartyYoutubeLib service) {
        this.service = service;
    }

    private void renderVideoPage(String id) {
        String info = service.getVideoInfo(id);
        System.out.println("Rendering video "+id+" page from data: "+info);
    }

    private void renderListPanel() {
        ArrayList<String> videos = service.listVideos();
        System.out.println("Rendering list...");
    }

    public void reactOnUserInput(String input) {
        System.out.println("User input "+input);
        renderVideoPage(input);
        renderListPanel();
    }
}
