package africa.semicolon.bankApp;


public class Customer {
    private final String firstName;
    private final String lastName;
    private String phoneNumber;
    private Address address;
    private Date date;

    public Customer(String firstName, String lastName, String phoneNumber, Address address, Date date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
