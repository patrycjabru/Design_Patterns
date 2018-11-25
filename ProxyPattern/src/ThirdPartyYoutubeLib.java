import java.util.ArrayList;

interface ThirdPartyYoutubeLib {
    ArrayList<String> listVideos();
    String getVideoInfo(String id);
    void downloadVideo(String id);
}
