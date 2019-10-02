package pointer.pattern.builder;

import java.util.Objects;
import java.util.function.Consumer;

public class PersonBuilder {
    public String firstName = "Test";
    public String lastName = "User";
    public int height = 10;

    private Consumer<PersonBuilder> builderConsumer;

    public PersonBuilder with(Consumer<PersonBuilder> builder) {
        builderConsumer = Objects.isNull(builderConsumer) ? builder : builderConsumer.andThen(builder);

        return this;
    }

    public Person build() {
        if (Objects.nonNull(builderConsumer)) {
            builderConsumer.accept(this);
        }
        return new Person(firstName, lastName, height);
    }
}
