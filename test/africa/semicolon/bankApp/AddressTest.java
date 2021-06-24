package africa.semicolon.bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {
    private Address address;
    @BeforeEach
    void setUp(){
        address = new Address(34, "Toyin Street");
    }

    @Test
    void testThatAddressHasAHouseNumber(){
        assertEquals(34, address.getHouseNumber());
    }

    @Test
    void testThatAddressHasStreetName(){
        assertEquals("Toyin Street", address.getStreetName());
    }

    @Test
    void testThatAddressHasACity(){
        assertEquals("Ikeja", address.getCity());
    }

    @Test
    void testThatAddressHasAState(){
        assertEquals("Lagos", address.getState());
    }

    @Test
    void testThatAddressCanChangeHouseNumber(){
        address.setHouseNumber(50);
        assertEquals(50, address.getHouseNumber());
    }

    @Test
    void testThatAddressCanChangeStreetName(){
        address.setStreetName("Oseni Salawu Street");
        assertEquals("Oseni Salawu Street", address.getStreetName());
    }

    @Test
    void testThatAddressCanChangeCity(){
        address.setCity("Lekki");
        assertEquals("Lekki", address.getCity());
    }

    @Test
    void testThatAddressCanChangeState(){
        address.setState("Ogun");
        assertEquals("Ogun", address.getState());
    }
    @Test
    void testThatAddressCanDisplayAddress(){
        assertEquals("34 Toyin Street, Ikeja, Lagos.", address.toString());
    }

}