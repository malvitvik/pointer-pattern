package pointer.pattern.builder;

public class Person {
    public final String firstName;
    public final String lastName;
    public final int height;

    public Person(String firstName, String lastName, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}

