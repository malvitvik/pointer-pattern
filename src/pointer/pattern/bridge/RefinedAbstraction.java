package pointer.pattern.bridge;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void doOperation() {
        System.out.println("RefinedAbstraction before");
        super.doOperation();
        System.out.println("RefinedAbstraction after");
    }
}
