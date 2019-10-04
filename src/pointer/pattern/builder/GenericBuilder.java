package pointer.pattern.builder;

import com.sun.istack.internal.NotNull;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class GenericBuilder {
    private final PersonModel personModel = new PersonModel();

    private List<Consumer<PersonModel>> fieldConsumers = new LinkedList<>();

    public GenericBuilder with(@NotNull Consumer<PersonModel> consumer) {
        fieldConsumers.add(consumer);
        return this;
    }

    public Person build() {
        fieldConsumers.forEach(consumer -> consumer.accept(personModel));
        return new Person(personModel.firstName, personModel.lastName, personModel.height, personModel.weight);
    }
}