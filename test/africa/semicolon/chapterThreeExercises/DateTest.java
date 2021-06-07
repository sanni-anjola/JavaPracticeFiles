package africa.semicolon.chapterThreeExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DateTest {
    private Date date;
    @BeforeEach
    void init(){
        date = new Date(2020, 7, 1);
    }

    @Test
    void testThatDateCanSetDay(){
        date.setDay(17);
        assertEquals(17, date.getDay());
    }

    @Test
    void testThatDateCannotSetWrongDate(){
        Date dummyDate = new Date(1999, -8, 76);
        assertNotEquals(-6, dummyDate.getMonth());
        assertNotEquals(76, dummyDate.getDay());
    }

    @Test
    void testThatDateDoesNotSetWrongDay(){
        date.setDay(45);
        assertNotEquals(45, date.getDay());
    }

    @Test
    void testThatDateCanSetMonth(){
        date.setMonth(11);
        assertEquals(11, date.getMonth());
    }

    @Test
    void testThatDateDoesNotSetWrongMonth(){
        date.setMonth(-11);
        assertNotEquals(-11, date.getMonth());
    }

    @Test
    void testThatDateCanSetYear(){
        date.setYear(1990);
        assertEquals(1990, date.getYear());
    }

    @Test
    void testThatDateCanDisplayDate(){
        assertEquals("2020/07/01", date.displayDate());
    }

}
