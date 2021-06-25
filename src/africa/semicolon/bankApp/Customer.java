package africa.semicolon.bankApp;


public class Customer {
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private Address address;
    private Date dateOfBirth;

    public Customer(String firstName, String lastName, String phoneNumber, Address address, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
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

    public Date getDateOfBirth() throws CloneNotSupportedException{
        return (Date) dateOfBirth.clone();
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
