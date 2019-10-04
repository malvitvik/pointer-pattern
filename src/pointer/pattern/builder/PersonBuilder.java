package pointer.pattern.builder;

import com.sun.istack.internal.NotNull;

import java.util.Objects;
import java.util.function.Consumer;

public class PersonBuilder {
    private final PersonModel model = new PersonModel();

    private Consumer<PersonModel> builderConsumer;

    public PersonBuilder with(@NotNull Consumer<PersonModel> consumer) {
        builderConsumer = Objects.isNull(builderConsumer) ? consumer : builderConsumer.andThen(consumer);

        return this;
    }

    public Person build() {
        if (Objects.nonNull(builderConsumer)) {
            builderConsumer.accept(model);
        }
        return new Person(model.firstName, model.lastName, model.height, model.weight);
    }
}