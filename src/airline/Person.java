package airline;

public class Person extends Payload{
    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Name: %s", firstName);
    }
}
