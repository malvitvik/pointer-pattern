package pointer.pattern.visitor;

public class GirlsHouse implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitGirlHouse(this);
    }

    public void giveDress() {
        System.out.println("Dress as a gift.");
    }
}
