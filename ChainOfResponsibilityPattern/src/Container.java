import java.util.ArrayList;

public abstract class Container extends Component {
    protected ArrayList<Component> children = new ArrayList<Component>();

    void add(Component child) {
        children.add(child);
        child.container = this;
    }
}
