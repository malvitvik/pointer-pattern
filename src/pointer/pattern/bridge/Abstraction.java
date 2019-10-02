package pointer.pattern.bridge;

public abstract class Abstraction {
    private final Implementor implementor;

    protected Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void doOperation() {
        implementor.doSomething();
    }

    public static Abstraction getAbstraction(Implementor implementor) {
        return new RefinedAbstraction(implementor);
    }
}