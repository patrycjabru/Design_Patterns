import java.util.ArrayList;

public class FacebookIterator implements ProfileIterator {
   private Facebook facebook;
   private String profileId;
   private String type;
   private int currentPosition = 0;
   private ArrayList<Profile> collection;

   public FacebookIterator(Facebook facebook, String profileId, String type) {
       this.facebook = facebook;
       this.profileId = profileId;
       this.type = type;
   }

   private void lazyInit() {
       if (collection == null) {
           collection = new ArrayList<Profile>();
           for(int i=0;i<10;i++)
               collection.add(new Profile(Integer.toString(i)));
       }
   }


    @Override
    public Profile getNext() {
        if (hasMore()) {
            currentPosition++;
            return collection.get(currentPosition);
        }
        return null;
    }

    @Override
    public boolean hasMore() {
        lazyInit();
        return collection.size()>currentPosition+1;
    }
}
