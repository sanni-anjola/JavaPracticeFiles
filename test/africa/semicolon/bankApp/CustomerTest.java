package africa.semicolon.bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    private Customer customer;
    @BeforeEach
    void setUp(){
        Date date = new Date(22, 2, 1986);
        Address address = new Address(50, "Oseni Salawu Street", "Egan");
        customer = new Customer("Moyosore", "Onigbanjo", "07001404017", address, date);
    }

    @Test
    void testThatCustomerHasAFirstName(){
        assertEquals("Moyosore", customer.getFirstName());
    }

    @Test
    void testThatCustomerHasALastName(){
        assertEquals("Onigbanjo", customer.getLastName());
    }

    @Test
    void testThatCustomerHasPhoneNumber(){
        assertEquals("07001404017", customer.getPhoneNumber());
    }

    @Test
    void testThatCustomerHasAddress(){
        try {
            assertEquals("50 Oseni Salawu Street, Egan, Lagos.", customer.getAddress().toString());
        }catch (CloneNotSupportedException ex){
            ex.getMessage();
        }
    }

    @Test
    void testThatCustomerCanSetAddress(){
        try {
            assertEquals("50 Oseni Salawu Street, Egan, Lagos.", customer.getAddress().toString());
            customer.setAddress(new Address(34, "Toyin Lawani Street", "Allen Avenue"));
            assertEquals("34 Toyin Lawani Street, Allen Avenue, Lagos.", customer.getAddress().toString());
        }catch (CloneNotSupportedException ex){
            ex.getMessage();
        }
    }

    @Test
    void testThatCustomerCanNotMutateAddressObject(){
        try {
            customer.setAddress(new Address(34, "Toyin Lawani Street", "Allen Avenue"));
            assertEquals("34 Toyin Lawani Street, Allen Avenue, Lagos.", customer.getAddress().toString());
            customer.getAddress().setState("Oyo");
            customer.getAddress().setCity("Alakia");
            customer.getAddress().setStreetName("Hope Street");
            customer.getAddress().setHouseNumber(1);
            assertEquals("34 Toyin Lawani Street, Allen Avenue, Lagos.", customer.getAddress().toString());
            assertNotEquals("1 Hope Street, Alakia, Oyo.", customer.getAddress().toString());
        }catch (CloneNotSupportedException ex){
            ex.getMessage();
        }
    }

    @Test
    void testThatCustomerHasADateOfBirth(){
        try {
            assertEquals("22/02/1986", customer.getDateOfBirth().toString());

        }catch (CloneNotSupportedException ex){
            ex.getMessage();
        }
    }

    @Test
    void testThatCustomerCanSetDateOfBirth(){
        try {
            customer.setDateOfBirth(new Date(24, 5, 2001));
            assertEquals("24/05/2001", customer.getDateOfBirth().toString());

        }catch (CloneNotSupportedException ex){
            ex.getMessage();
        }
    }

    @Test
    void testThatCustomerCannotMutateDateObject(){
        try {
            customer.setDateOfBirth(new Date(24, 5, 2001));
            assertEquals("24/05/2001", customer.getDateOfBirth().toString());

            customer.getDateOfBirth().setDay(12);
            customer.getDateOfBirth().setMonth(7);
            assertNotEquals("12/07/2001", customer.getDateOfBirth().toString());

        }catch (CloneNotSupportedException ex){
            ex.getMessage();
        }
    }
}