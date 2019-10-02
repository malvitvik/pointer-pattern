package pointer.pattern.composite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Composite extends Component {
    private List<Component> nodes = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println(getName());
        nodes.forEach(Component::operation);
    }

    @Override
    public void add(Component component) {
        nodes.add(component);
    }

    public void add(Collection<Component> components) {
        nodes.addAll(components);
    }

    @Override
    public void remove(Component component) {
        nodes.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return nodes.get(index);
    }
}