package pointer.pattern.bridge;

public class ConcreteImplementorA implements Implementor {
    @Override
    public void doSomething() {
        System.out.println("ImplementorA");
    }
}

