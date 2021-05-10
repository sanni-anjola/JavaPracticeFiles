package africa.semicolon.chapterThreeExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class HeartRateTest {

    private HeartRate heartRate;
    @BeforeEach
    void init(){
        heartRate = new HeartRate("John", "Blue", 11, 24, 1970);
    }

    @Test
    void testThatHearRateCanSetFirstName(){
        heartRate.setFirstName("Jane");
        assertEquals("Jane", heartRate.getFirstName());
    }

    @Test
    void testThatHearRateCanSetLastName(){
        heartRate.setLastName("Green");
        assertEquals("Green", heartRate.getLastName());
    }

    @Test
    void testThatHeartRateCanSetDay(){
        heartRate.setDay(17);
        assertEquals(17, heartRate.getDay());
    }

    @Test
    void testThatHeartRateCannotSetWrongHeartRate(){
        HeartRate dummyHeartRate = new HeartRate("Omosetan", "Omorele",23, -8, 1976);
        assertNotEquals(23, dummyHeartRate.getMonth());
        assertNotEquals(-8, dummyHeartRate.getDay());
    }

    @Test
    void testThatHeartRateDoesNotSetWrongDay(){
        heartRate.setDay(45);
        assertNotEquals(45, heartRate.getDay());
    }

    @Test
    void testThatHeartRateCanSetMonth(){
        heartRate.setMonth(11);
        assertEquals(11, heartRate.getMonth());
    }

    @Test
    void testThatHeartRateDoesNotSetWrongMonth(){
        heartRate.setMonth(-11);
        assertNotEquals(-11, heartRate.getMonth());
    }

    @Test
    void testThatHeartRateCanSetYear(){
        heartRate.setYear(1990);
        assertEquals(1990, heartRate.getYear());
    }

    @Test
    void testThatHeartRateCanGetAge(){
        Calendar calendar = new GregorianCalendar();
        int currentYear = calendar.get(Calendar.YEAR);

        assertEquals(currentYear - heartRate.getYear(), heartRate.getAge());
    }

    @Test
    void testThatHeartRateCanCalculateMaximumHeartRate(){
        assertEquals(169, heartRate.getMaximumHeartRate() );
    }

    @Test
    void testThatHeartRateCanCalculateTargetHeartRateRange(){
        String target = heartRate.getTargetHeartRateRange();
        System.out.println(target);
        assertEquals("84.50 - 143.65", target);
    }
}
