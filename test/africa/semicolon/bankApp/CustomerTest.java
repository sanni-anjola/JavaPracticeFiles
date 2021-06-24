package africa.semicolon.bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    private Customer customer;
    @BeforeEach
    void setUp(){
        Date date = new Date(22, 2, 1986);
        Address address = new Address(50, "Oseni Salawu", "Egan");
        customer = new Customer("Moyosore", "Onigbanjo", address, date);
    }

    @Test
    void testThatCustomerHasAName(){
        assertEquals("Moyosore", customer.getFirstName());
    }

}