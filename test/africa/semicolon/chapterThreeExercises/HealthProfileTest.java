package africa.semicolon.chapterThreeExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class HealthProfileTest {

    private HealthProfile healthProfile;
    @BeforeEach
    void init(){
        healthProfile = new HealthProfile("John", "Blue", "Male", 11, 24, 1970, 68.4, 132.28);
    }

    @Test
    void testThatHearRateCanSetFirstName(){
        healthProfile.setFirstName("Jane");
        assertEquals("Jane", healthProfile.getFirstName());
    }

    @Test
    void testThatHearRateCanSetLastName(){
        healthProfile.setLastName("Green");
        assertEquals("Green", healthProfile.getLastName());
    }

    @Test
    void testThatHealthProfileCanSetDay(){
        healthProfile.setDay(17);
        assertEquals(17, healthProfile.getDay());
    }

    @Test
    void testThatHealthProfileCannotSetWrongHealthProfile(){
        HealthProfile dummyHealthProfile = new HealthProfile("Omosetan", "Omorele", "Female",-5, -7, 1976, -9, -34);
        assertNotEquals(-5, dummyHealthProfile.getMonth());
        assertEquals(1, dummyHealthProfile.getMonth());
        assertEquals(1, dummyHealthProfile.getDay());
        assertNotEquals(-7, dummyHealthProfile.getDay());
        assertNotEquals(-9, dummyHealthProfile.getHeight());
        assertNotEquals(-34, dummyHealthProfile.getWeight());
    }

    @Test
    void testThatHealthProfileTestDoesNotSetWrongDayForMonthAndLeapYear(){
        HealthProfile dummyHealthProfile = new HealthProfile("Omosetan", "Omorele", "Female",2, 29, 1900, -9, -34);
        assertNotEquals(29, dummyHealthProfile.getDay());

        dummyHealthProfile = new HealthProfile("Omosetan", "Omorele", "Female",11, 31, 1976, -9, -34);
        assertNotEquals(31, dummyHealthProfile.getDay());
        dummyHealthProfile = new HealthProfile("Omosetan", "Omorele", "Female",1, 31, 1976, -9, -34);
        assertEquals(31, dummyHealthProfile.getDay());

    }
    @Test
    void testThatHealthProfileDoesNotSetWrongDay(){
        healthProfile.setDay(45);
        assertNotEquals(45, healthProfile.getDay());
    }

    @Test
    void testThatHealthProfileCanSetMonth(){
        healthProfile.setMonth(11);
        assertEquals(11, healthProfile.getMonth());
    }

    @Test
    void testThatHealthProfileDoesNotSetWrongMonth(){
        healthProfile.setMonth(-11);
        assertNotEquals(-11, healthProfile.getMonth());
    }

    @Test
    void testThatHealthProfileCanSetYear(){
        healthProfile.setYear(1990);
        assertEquals(1990, healthProfile.getYear());
    }

    @Test
    void testThatDateCanGetDateOfBirth(){
        assertEquals("1970/11/24", healthProfile.getDateOfBirth());
    }

    @Test
    void testThatHealthProfileCanSetGender(){
        healthProfile.setGender("Bisexual");
        assertEquals("Bisexual", healthProfile.getGender());
    }

    @Test
    void testThatHealthProfileCanSetHeight(){
        healthProfile.setHeight(70);
        assertEquals(70, healthProfile.getHeight());
    }

    @Test
    void testThatHealthProfileCanSetWeight(){
        healthProfile.setWeight(170);
        assertEquals(170, healthProfile.getWeight());
    }

    @Test
    void testThatHealthProfileCanGetAge(){
        LocalDate today = LocalDate.now();

        assertEquals(today.getYear() - healthProfile.getYear(), healthProfile.getAge());
    }

    @Test
    void testThatHealthProfileCanCalculateMaximumHeartRate(){
        assertEquals(169, healthProfile.getMaximumHeartRate() );
    }

    @Test
    void testThatHealthProfileCanCalculateTargetHeartRateRange(){
        String target = healthProfile.getTargetHeartRateRange();
        System.out.println(target);
        assertEquals("84.50 - 143.65", target);
    }

    @Test
    void testThatHealthProfileCanCalculateBmi(){
        double bmi = healthProfile.bmi();

        assertEquals(19.876380767, bmi, 0.000001);
    }

    @Test
    void testThatHealthProfileCanDisplayHealthInformation(){
        String healthInfo = String.format("Name: %s %s%nGender: %s%nDate Of Birth: %s%nAge: %d%nMaximum Heart Rate: %d%nTarget HeartRate Range: %s%nBMI: %.2f",
                "Blue", "John", "Male", "1970/11/24", 51, 169, "84.50 - 143.65", 19.88);
//        System.out.println(healthProfile.displayHealthProfile());
        assertEquals(healthInfo, healthProfile.displayHealthProfile());
    }
}
