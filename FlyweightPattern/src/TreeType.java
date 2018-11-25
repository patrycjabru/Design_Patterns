public class TreeType {
    String name;
    String color;
    String textureId;

    public TreeType(String name, String color, String textureId) {
        this.name = name;
        this.color = color;
        this.textureId = textureId;
    }

    public void draw(int x, int y) {
        System.out.println("Drawing tree on x="+x+", y="+y);
    }
}
