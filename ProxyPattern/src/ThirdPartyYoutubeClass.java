import java.util.ArrayList;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib{

    @Override
    public ArrayList<String> listVideos() {
        ArrayList<String> videos = new ArrayList<String>();
        System.out.println("Gets list of videos");
        return videos;
    }

    @Override
    public String getVideoInfo(String id) {
        System.out.println("Gets information about video "+id);
        return "Id "+id+" info";
    }

    @Override
    public void downloadVideo(String id) {
        System.out.println("Downloads video "+id+" from Youtube");
    }
}
