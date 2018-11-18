import javax.swing.text.AsyncBoxView;
import java.util.ArrayList;

public class CompositeGraphic implements Graphic {
    private ArrayList<Graphic> childGraphics = new ArrayList<Graphic>();

    @Override
    public void print() {
        for (Graphic g : childGraphics)
            g.print();
    }

    public void addChild(Graphic g) {
        childGraphics.add(g);
    }

    public void removeChild(Graphic g) {
        childGraphics.remove(g);
    }
}
