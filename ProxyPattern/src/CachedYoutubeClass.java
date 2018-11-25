import java.util.ArrayList;

public class CachedYoutubeClass implements ThirdPartyYoutubeLib {
    ThirdPartyYoutubeLib service;
    ArrayList<String> listCache;
    String videoCache;
    boolean needReset;

    public CachedYoutubeClass(ThirdPartyYoutubeLib service) {
        this.service = service;
        needReset = false;
    }

    @Override
    public ArrayList<String> listVideos() {
        if (listCache == null || needReset)
            listCache = service.listVideos();
        return listCache;
    }

    @Override
    public String getVideoInfo(String id) {
        if (videoCache == null || needReset)
            videoCache = service.getVideoInfo(id);
        return videoCache;
    }

    @Override
    public void downloadVideo(String id) {
        if (!listCache.contains(id) || needReset) {
            service.downloadVideo(id);
            listCache.add(id);
        }
    }
}
