package pointer.pattern.composite;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println(getName());
    }

    @Override
    public void add(Component component) {
        throw new NotImplementedException();
    }

    @Override
    public void add(Collection<Component> component) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(Component component) {
        throw new NotImplementedException();
    }

    @Override
    public Component getChild(int index) {
        throw new NotImplementedException();
    }
}
