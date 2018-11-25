public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw() {
        System.out.println("Drawing tree: x="+x+", y="+y+", name="+type.name+", color="+type.color+", type="+type.textureId);
        type.draw(x,y);
    }
}
