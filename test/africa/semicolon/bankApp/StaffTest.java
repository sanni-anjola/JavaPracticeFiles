package africa.semicolon.bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {
    private Staff staff;

    @BeforeEach
    void setUp(){
        staff = new Staff("Kazeem", "Alogba");
    }

    @Test
    void testThatAStaffHasAName(){
        assertEquals("Kazeem", staff.getFirstName());
    }

    @Test
    void testThatStaffHasALastName(){
        assertEquals("Alogba", staff.getLastName());
    }

    @Test
    void testThatStaffHasARole(){
        assertEquals("admin", staff.getRole());
    }

    @Test
    void testThatStaffHasADefaultPassword(){
        assertEquals("default", staff.getPassword());
    }

    @Test
    void testThatStaffCanChangePassword(){
        boolean isPasswordChanged = staff.changePassword("default", "administrator");
        assertEquals("administrator", staff.getPassword());
        assertTrue(isPasswordChanged);
    }

    @Test
    void testThatStaffPasswordDoesNotChangeWithWrongPassword(){
        boolean isPasswordChanged = staff.changePassword("admin", "administrator");
        assertNotEquals("administrator", staff.getPassword());
        assertFalse(isPasswordChanged);
    }
}