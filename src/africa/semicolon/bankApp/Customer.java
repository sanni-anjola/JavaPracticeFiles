package africa.semicolon.bankApp;


public class Customer {
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private Address address;
    private Date dateOfBirth;
    private final Account customerAccount;

    public Customer(String firstName, String lastName, String phoneNumber, Address address, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.customerAccount = new Account();
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

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public Account getCustomerAccount() throws CloneNotSupportedException{
        return (Account) customerAccount.clone();
    }

    @Override
    public String toString(){
        try {
            return firstName + " " + lastName + " with Account Number " + getCustomerAccount();
        }catch (CloneNotSupportedException ex){
           return ex.getMessage();
        }
    }
}
