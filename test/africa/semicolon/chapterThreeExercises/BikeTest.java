package africa.semicolon.chapterThreeExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
ClassName: Bike
Requirements:
1. The Bike can be turned On and Off.
2. The Bike can accelerate or decelerate only when its on
3. The Bike is automatic, that is, the gear changes as it accelerates or decelerates
    a. Gear is 0, when the Bike is Off
    b. Gear changes to 1, when the Bike is On.
    c. Gear Changes to 2, when Speed is 20.
    d. Gear Changes to 3, when Speed is 40.
    e. Gear Changes to 4, when Speed is 70.
    f. Max Gear Number is 4.
4. The Bike Speed increases based on the gear Number. that is,
    a. When Gear Number is 1, the Speed increases by 1
    b. when Gear Number is 2, the Speed increases by 2.
5. The Bike is allowed to set Speed Only for testing to simulate acceleration/deceleration.

 */
public class BikeTest {
    private Bike okada;

    @BeforeEach
    public void startEachTestWithThis(){
        okada = new Bike();
    }

    @Test
    public void testThatSpeedCanBeSet(){
        //given
        okada.setOn(true);
        assertTrue(okada.isOn());
        //when
        okada.setSpeedInKmPerHour(15);
        //assert
        assertEquals(15, okada.getSpeedInKmPerHour());

    }

    @Test
    public void testThatBikeCanChangeStateFromOffToOn(){
        assertFalse(okada.isOn());

        okada.setOn(true);

        assertTrue(okada.isOn());
    }

    @Test
    public void speedCannotBeSetWhenBikeIsOff(){
        //given
        okada.setOn(false);
        assertFalse(okada.isOn());
        okada.setSpeedInKmPerHour(45);

        assertEquals(0, okada.getSpeedInKmPerHour());

    }

    @Test
    public void testThatSetOnChangesTheGearNumberToOne(){
        assertEquals(0, okada.getCurrentGearNumber());
        okada.setOn(true);
        assertEquals(1, okada.getCurrentGearNumber());
    }

    @Test
    public void testThatBikeCanAccelerateOnGearOne(){
        okada.setOn(true);

        //when
        okada.speedUp();
        assertEquals(1, okada.getSpeedInKmPerHour());

        okada.speedUp();
        assertEquals(2, okada.getSpeedInKmPerHour());

        okada.setSpeedInKmPerHour(13);
        okada.speedUp();
        assertEquals(14, okada.getSpeedInKmPerHour());
    }

    @Test
    public void testThatBikeCanChangeToGearTwoWhenItHit20Kmph(){
        okada.setOn(true);
        okada.setSpeedInKmPerHour(20);
        assertEquals(1, okada.getCurrentGearNumber());

        okada.speedUp();
        assertEquals(2, okada.getCurrentGearNumber());
        assertEquals(22, okada.getSpeedInKmPerHour());
    }

    @Test
    public void testThatBikeCanChangeToGearThreeWhenItHit40Kmph(){
        okada.setOn(true);
        okada.setSpeedInKmPerHour(20);
        okada.speedUp();
        okada.setSpeedInKmPerHour(40);
        assertEquals(2, okada.getCurrentGearNumber());

        okada.speedUp();
        assertEquals(3, okada.getCurrentGearNumber());
        assertEquals(43, okada.getSpeedInKmPerHour());
    }

    @Test
    public void testThatBikeCanChangeToGearFourWhenItHit70Kmph(){
        okada.setOn(true);
        okada.setSpeedInKmPerHour(40);
        okada.speedUp();
        okada.setSpeedInKmPerHour(70);
        assertEquals(3, okada.getCurrentGearNumber());

        okada.speedUp();
        assertEquals(4, okada.getCurrentGearNumber());
        assertEquals(74, okada.getSpeedInKmPerHour());
    }

    @Test
    public void testThatBikeCanDecelerate(){
        okada.setOn(true);
        okada.setSpeedInKmPerHour(40);
        okada.speedUp();
        assertEquals(3, okada.getCurrentGearNumber());
        okada.slowDown();
        assertEquals(3, okada.getCurrentGearNumber());
        assertEquals(40, okada.getSpeedInKmPerHour());
        okada.slowDown();
        assertEquals(2, okada.getCurrentGearNumber());
        assertEquals(38, okada.getSpeedInKmPerHour());

    }

    @Test
    public void testThatBikeCanChangeToGearThreeWhenItHit70Kmph(){
        okada.setOn(true);
        okada.setSpeedInKmPerHour(70);
        okada.speedUp();
        okada.slowDown();
        assertEquals(4, okada.getCurrentGearNumber());
        assertEquals(70, okada.getSpeedInKmPerHour());

        okada.slowDown();
        assertEquals(3, okada.getCurrentGearNumber());
    }

    @Test
    public void testThatBikeCanChangeToGearTwoWhenItHit40Kmph(){
        okada.setOn(true);
        okada.setSpeedInKmPerHour(43);
        okada.slowDown();

        assertEquals(40, okada.getSpeedInKmPerHour());
        assertEquals(3, okada.getCurrentGearNumber());

        okada.slowDown();
        assertEquals(2, okada.getCurrentGearNumber());
    }

    @Test
    public void testThatBikeCanChangeToGearOneWhenItHit20Kmph(){
        okada.setOn(true);
        okada.setSpeedInKmPerHour(22);
        okada.slowDown();

        assertEquals(20, okada.getSpeedInKmPerHour());
        assertEquals(2, okada.getCurrentGearNumber());

        okada.slowDown();
        assertEquals(1, okada.getCurrentGearNumber());
        assertEquals(19, okada.getSpeedInKmPerHour());
    }
}
