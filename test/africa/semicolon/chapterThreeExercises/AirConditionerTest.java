package africa.semicolon.chapterThreeExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
ClassName: AirConditioner
Requirements:
1. The AirConditioner set its name on creation.
2. The AirConditioner can be turned On and Off.
3 The AirConditioner can increase or decrease in temperature only when its on
4. The AirConditioner Cannot Increase temperature above the Maximum Temperature
5. The AirConditioner Cannot Decrease temperature below the Minimum Temperature
* LOWEST TEMPERATURE = 16
* HIGHEST TEMPERATURE = 30
6. The AirConditioner starts with an initial temperature of 16.

 */


public class AirConditionerTest {

    private AirConditioner airConditioner;

    @BeforeEach
    public void startEveryTestWithThis(){
        airConditioner = new AirConditioner("Haier Thermocool");
    }

    @Test
    public void testThatAirConditionerHasAName(){
        assertEquals("Haier Thermocool", airConditioner.getProductName());
    }


    @Test
    public void testThatAirConditionerCanBeTurnedOn(){
        assertFalse(airConditioner.isOn());

        airConditioner.setOn(true);
        assertTrue(airConditioner.isOn());
    }

    @Test
    public void testThatAirConditionerCanBeTurnedOff(){
        airConditioner.setOn(true);
        assertTrue(airConditioner.isOn());

        airConditioner.setOn(false);
        assertFalse(airConditioner.isOn());
    }

    @Test
    public void testThatAirConditionerStartTemperatureIs16(){
        airConditioner.setOn(true);
        assertEquals(16, airConditioner.getTemperature());
    }

    @Test
    public void testThatAirConditionerCannotIncreaseTemperatureWhenOff(){
        airConditioner.increaseTemperature();

        assertEquals(0, airConditioner.getTemperature());
    }

    @Test
    public void testThatAirConditionerCannotDecreaseTemperatureWhenOff(){
        airConditioner.decreaseTemperature();

        assertEquals(0, airConditioner.getTemperature());
    }

    @Test
    public void testThatAirConditionerCanIncreaseTemperatureWhenOn(){
        airConditioner.setOn(true);
        assertEquals(16, airConditioner.getTemperature());

        airConditioner.increaseTemperature();
        assertEquals(17, airConditioner.getTemperature());
    }

    @Test
    public void testThatAirConditionerCannotDecreaseBelowLowestTemperatureWhenOn(){
        airConditioner.setOn(true);
        assertEquals(16, airConditioner.getTemperature());

        airConditioner.decreaseTemperature();
        assertEquals(16, airConditioner.getTemperature());
    }

    @Test
    public void testThatAirConditionerCanDecreaseTemperature(){
        airConditioner.setOn(true);
        assertEquals(16, airConditioner.getTemperature());

        airConditioner.increaseTemperature();   // 17
        airConditioner.increaseTemperature();   // 18
        airConditioner.increaseTemperature();   // 19
        airConditioner.decreaseTemperature();   // 18
        assertEquals(18, airConditioner.getTemperature());
    }

    @Test
    public void testThatAirConditionerCannotIncreaseBeyondMaximumTemperature(){
        airConditioner.setOn(true);
        assertEquals(16, airConditioner.getTemperature());

        airConditioner.increaseTemperature();   // 17
        airConditioner.increaseTemperature();   // 18
        airConditioner.increaseTemperature();   // 19
        airConditioner.increaseTemperature();   // 20
        airConditioner.increaseTemperature();   // 21
        airConditioner.increaseTemperature();   // 22
        airConditioner.increaseTemperature();   // 23
        airConditioner.increaseTemperature();   // 24
        airConditioner.increaseTemperature();   // 25
        airConditioner.increaseTemperature();   // 26
        airConditioner.increaseTemperature();   // 27
        airConditioner.increaseTemperature();   // 28
        airConditioner.increaseTemperature();   // 29
        airConditioner.increaseTemperature();   // 30
        airConditioner.increaseTemperature();   // 30
        airConditioner.increaseTemperature();   // 30
        assertEquals(30, airConditioner.getTemperature());

    }
}
