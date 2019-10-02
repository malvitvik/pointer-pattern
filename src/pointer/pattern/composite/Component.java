package pointer.pattern.composite;

import java.util.Arrays;
import java.util.Collection;

public abstract class Component {
    private String name;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void operation();
    public abstract void add(Component component);
    public abstract void add(Collection<Component> component);
    public abstract void remove(Component component);
    public abstract Component getChild(int index);

    public static Component getComponent(String name, Component... components) {
        Component component = new Composite(name);
        component.add(Arrays.asList(components));

        return component;
    }

    public static Component getComponent(String name, boolean isFinal) {
        Component component = isFinal ? new Leaf(name) : new Composite(name);

        return component;
    }
}
