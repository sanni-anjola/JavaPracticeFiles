package africa.semicolon.bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    private Date date;

    @BeforeEach
    void setUp(){
        date = new Date(23, 6, 1998);
    }
    @Test
    void testThatDateCanSetDay(){
        date.setDay(17);
        assertEquals(17, date.getDay());
    }

    @Test
    void testThatDateThrowsErrorWhenAWrongDayIsSet(){

        assertThrows(IllegalArgumentException.class, () -> new Date(-5, -7, 1986));

    }

    @Test
    void testThatDateThrowsErrorWhenAWrongMonthIsSet(){

        assertThrows(IllegalArgumentException.class, () -> new Date(5, -7, 1986));

    }

    @Test
    void testThatDateTestDoesNotSetWrongDayForMonthAndLeapYearButThrowsAnException(){
        assertThrows(IllegalArgumentException.class, () -> new Date(29, 2, 1900));

        assertThrows(IllegalArgumentException.class, () -> new Date(31, 11, 1976));

        assertDoesNotThrow(() -> {new Date(31, 1, 1976);});
    }
    @Test
    void testThatDateDoesNotSetWrongDayButThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> date.setDay(45));
    }

    @Test
    void testThatDateCanSetMonth(){
        date.setMonth(11);
        assertEquals(11, date.getMonth());
    }

    @Test
    void testThatDateDoesNotSetWrongMonthButThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> date.setMonth(-11));
    }

    @Test
    void testThatDateCanSetYear(){
        date.setYear(1990);
        assertEquals(1990, date.getYear());
    }

    @Test
    void testThatDateCanGetDateOfBirth(){
        assertEquals("23/06/1998", date.getDateOfBirth());
    }

    @Test
    void testThatDateCanGetAge(){
        LocalDate today = LocalDate.now();

        assertEquals(today.getYear() - date.getYear(), date.getAge());
    }

}