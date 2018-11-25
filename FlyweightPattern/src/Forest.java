import java.util.ArrayList;

public class Forest {
    private ArrayList<Tree> trees = new ArrayList<Tree>();

    public void plantTree(int x, int y, String name, String color, String textureId) {
        TreeType type = TreeFactory.getTreeType(name, color, textureId);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void draw() {
        System.out.println("Drawing forest");
        for (Tree tree:trees) {
            tree.draw();
        }
    }
}
