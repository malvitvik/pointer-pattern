package pointer.pattern.bridge;

public class ConcreteImplementorB implements Implementor {
    @Override
    public void doSomething() {
        System.out.println("ImplementorB");
    }
}
