import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<Shape>();
        shapes.add(new Dot(3,5));
        shapes.add(new Dot(5,7));
        shapes.add(new Rectangle(1,3,3,5));

        XMLExportVisitor exportVisitor = new XMLExportVisitor();

        for (Shape s:shapes) {
            s.accept(exportVisitor);
        }
    }
}
