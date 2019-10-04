package pointer.pattern.visitor;

public class BoysHouse implements Element {

    public void tellFairyTale() {
        System.out.println("Fairy tale....");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBoysHouse(this);
    }
}
