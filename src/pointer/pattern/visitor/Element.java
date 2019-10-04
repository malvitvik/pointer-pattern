package pointer.pattern.visitor;

public interface Element {
    void accept(Visitor visitor);
}
