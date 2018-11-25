public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(0,0,"oak","silver","someTexture1");
        forest.plantTree(1,3,"oak","silver","someTexture1");
        forest.plantTree(1,2,"teek", "green", "someTexture2");

        forest.draw();
    }
}
