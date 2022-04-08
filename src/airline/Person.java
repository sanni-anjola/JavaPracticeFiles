package airline;

import java.util.Objects;

public class Person extends Payload{
    private String firstName;
    private String lastName;



    public Person(String firstName, String lastName, Double weight) {
        super(weight);
        this.firstName = firstName;
        this.lastName = lastName;
        if(Objects.equals(this.getClass().getSimpleName(), "Person")) System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Name: %s", firstName);
    }
}
