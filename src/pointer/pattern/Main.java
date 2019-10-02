package pointer.pattern;

import pointer.pattern.adapter.Adaptee;
import pointer.pattern.adapter.Adapter;
import pointer.pattern.adapter.Target;
import pointer.pattern.bridge.Abstraction;
import pointer.pattern.bridge.ConcreteImplementorA;
import pointer.pattern.bridge.ConcreteImplementorB;
import pointer.pattern.builder.GenericBuilder;
import pointer.pattern.builder.Person;
import pointer.pattern.builder.PersonBuilder;
import pointer.pattern.builder.PersonModel;
import pointer.pattern.composite.Component;
import pointer.pattern.composite.Leaf;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Target adapter = new Adapter(new Adaptee());
        adapter.request();
        System.out.println("---------");

        doOperation(Abstraction.getAbstraction(new ConcreteImplementorA()));
        System.out.println("---------");

        doOperation(Abstraction.getAbstraction(new ConcreteImplementorB()));
        System.out.println("---------");

        Component branch1 = Component.getComponent("Br1", new Leaf("L1"), new Leaf("L2"));
        Component branch2 = Component.getComponent("Br2", new Leaf("L3"), new Leaf("L4"), new Leaf("L5"));
        Component root = Component.getComponent("ROOT", branch1, branch2);
        root.operation();

        Person person = new Person("Jack", "Doe", 122, 12.7f);

        Person person1 = new PersonBuilder().with(p -> {
            p.firstName = "firstName";
            p.lastName = "lastName";
            p.height = 120;
            p.weight = 14.2f;
        }).build();

        Person person2 = new PersonBuilder().build();

        Stream.of(person, person1, person2).forEach(System.out::println);

        new GenericBuilder().with(p -> {
            p.firstName = "firstName";
            p.lastName = "lastName";
            p.height = 120;
            p.weight = 14.2f;
        }).build();
    }

    private static void doOperation(Abstraction abstraction) {
        abstraction.doOperation();
    }

}