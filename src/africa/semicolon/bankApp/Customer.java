package africa.semicolon.bankApp;


public class Customer {
    private final String firstName;
    private final String lastName;
    private Address address;
    private Date date;

    public Customer(String firstName, String lastName, Address address, Date date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.date = date;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() throws CloneNotSupportedException{
        return (Address) address.clone();
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDate() throws CloneNotSupportedException{
        return (Date) date.clone();
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
