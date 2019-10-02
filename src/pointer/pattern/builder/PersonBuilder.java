package pointer.pattern.builder;

import com.sun.istack.internal.NotNull;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class PersonBuilder {
    private final PersonModel personModel = new PersonModel();

    private Consumer<PersonModel> builderConsumer;

    public PersonBuilder with(@NotNull Consumer<PersonModel> consumer) {
        builderConsumer = Objects.isNull(builderConsumer) ? consumer : builderConsumer.andThen(consumer);

        return this;
    }

    public Person build() {
        if (Objects.nonNull(builderConsumer)) {
            builderConsumer.accept(personModel);
        }
        return new Person(personModel.firstName, personModel.lastName, personModel.height, personModel.weight);
    }
}