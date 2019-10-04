package pointer.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class Village {
    private List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        elements.add(element);
    }

    public void remove(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        elements.forEach(e -> e.accept(visitor));
    }
}
