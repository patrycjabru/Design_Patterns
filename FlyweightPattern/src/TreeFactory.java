import java.util.ArrayList;

public class TreeFactory {
    static ArrayList<TreeType> treeTypes = new ArrayList<TreeType>();

    public static TreeType getTreeType(String name, String color, String textureId) {
        TreeType type = findTreeType(name,color,textureId);
        if (type == null) {
            System.out.println("Creating new type");
            type = new TreeType(name, color, textureId);
            treeTypes.add(type);
        }
        return type;

    }

    private static TreeType findTreeType(String name, String color, String textureId) {
        for (TreeType tree:treeTypes) {
            if (tree.color.equals(color) &&
                    tree.textureId.equals(textureId) &&
                    tree.name.equals(name)) {
                System.out.println("This tree type already exist!");
                return tree;
            }
        }
        return null;
    }
}
