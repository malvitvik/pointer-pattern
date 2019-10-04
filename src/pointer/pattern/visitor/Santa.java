package pointer.pattern.visitor;

public class Santa implements Visitor {
    @Override
    public void visitBoysHouse(BoysHouse boysHouse) {
        boysHouse.tellFairyTale();
    }

    @Override
    public void visitGirlHouse(GirlsHouse girlsHouse) {
        girlsHouse.giveDress();
    }
}
