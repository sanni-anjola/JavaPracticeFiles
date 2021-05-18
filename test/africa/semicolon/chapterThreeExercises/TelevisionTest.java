package africa.semicolon.chapterThreeExercises;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
ClassName: Television
Requirements:
1. The Television can be turned On and Off.
2. The Television can increase or decrease Volume only when its on
3. The Television can set Volume only when its on
4. The Television can change channel in ascending or descending order only when its on
5. The Television can set channel only when its on

6. The Constraints,
    a. Minimum volume is 0,
    b. Maximum volume is 100
    c. Least Channel number is 0
    d. Highest Channel number is 9
    e. TV Channel can go from 0 to 9 when descending and 9 to 0 when ascending

 */
public class TelevisionTest {

    private Television tv;

    @BeforeEach
    void initializeTvBeforeEachTest(){
        tv = new Television("Grundig");
    }

    @Test
    void testThatTelevisionProductNameIsSetAtCreation(){
        assertEquals("Grundig", tv.getProductName());
    }

    @Test
    void testThatTelevisionCanBeTurnedOn(){
        tv.setOn(true);
        assertTrue(tv.isOn());
    }

    @Test
    void testThatTelevisionCanBeTurnedOff(){
        tv.setOn(false);
        assertFalse(tv.isOn());
    }

    @Test
    void testThatTelevisionCanSetChannelWhenOn(){
        tv.setOn(true);
        tv.setChannel(7);
        assertEquals(7, tv.getChannel());
    }

    @Test
    void testThatTelevisionCannotSetChannelWhenOff(){
        tv.setChannel(8);
        assertEquals(0, tv.getChannel());
    }

    @Test
    void testThatTelevisionCannotSetBelowChannelNumberZero(){
        tv.setOn(true);
        tv.setChannel(-8);
        assertEquals(0, tv.getChannel());
    }

    @Test
    void testThatTelevisionCannotSetAboveChannelNumberNine(){
        tv.setOn(true);
        tv.setChannel(11);
        assertEquals(0, tv.getChannel());
    }

    @Test
    void testThatTelevisionCanChangeChannelAscending(){
        tv.setOn(true);
        tv.changeChannelAscend();
        assertEquals(1, tv.getChannel());
    }

    @Test
    void testThatTelevisionChannelStartCountingFromZeroWhenMaximumItExceedsMaxChannel(){
        tv.setOn(true);
        tv.setChannel(8);
        tv.changeChannelAscend();
        tv.changeChannelAscend();
        tv.changeChannelAscend();

        assertEquals(1, tv.getChannel());
    }

    @Test
    void testThatTelevisionCanChangeChannelDescending(){
        tv.setOn(true);
        tv.setChannel(7);
        tv.changeChannelDescend();
        assertEquals(6, tv.getChannel());
    }

    @Test
    void testThatTelevisionChannelStartCountingFromNineWhenItDescendsBelowZero(){
        tv.setOn(true);
        tv.setChannel(0);
        tv.changeChannelDescend();
        tv.changeChannelDescend();
        tv.changeChannelDescend();

        assertEquals(7, tv.getChannel());
    }

    @Test
    void testThatTelevisionChannelNumberStateIsMaintainedBetweenOffAndOn(){
        tv.setOn(true);
        tv.setChannel(6);
        tv.setOn(false);
        tv.setChannel(9);
        tv.setOn(true);
        assertEquals(6, tv.getChannel());
    }

    @Test
    void testThatTelevisionCanSetVolumeWhenOn(){
        tv.setOn(true);
        tv.setVolume(67);
        assertEquals(67, tv.getVolume());

    }

    @Test
    void testThatTelevisionCannotSetVolumeWhenOff(){
        tv.setVolume(8);
        assertEquals(0, tv.getVolume());
    }

    @Test
    void testThatTelevisionCannotSetBelowVolumeNumberZero(){
        tv.setOn(true);
        tv.setVolume(-8);
        assertEquals(0, tv.getVolume());
    }

    @Test
    void testThatTelevisionCannotSetAboveVolumeNumberHundred(){
        tv.setOn(true);
        tv.setVolume(110);
        assertEquals(0, tv.getVolume());
    }

    @Test
    void testThatTelevisionCanIncreaseVolume(){
        tv.setOn(true);
        tv.increaseVolume();
        assertEquals(1, tv.getVolume());
    }

    @Test
    void testThatTelevisionVolumeCannotIncreaseBeyondHundred(){
        tv.setOn(true);
        tv.setVolume(99);
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();

        assertEquals(100, tv.getVolume());
    }

    @Test
    void testThatTelevisionCanDecreaseVolume(){
        tv.setOn(true);
        tv.setVolume(67);
        tv.decreaseVolume();
        tv.decreaseVolume();
        assertEquals(65, tv.getVolume());
    }

    @Test
    void testThatTelevisionVolumeCannotDecreaseBelowZero(){
        tv.setOn(true);
        tv.setVolume(0);
        tv.decreaseVolume();
        tv.decreaseVolume();
        tv.decreaseVolume();

        assertEquals(0, tv.getChannel());
    }

    @Test
    void testThatTelevisionVolumeNumberStateIsMaintainedBetweenOffAndOn(){
        tv.setOn(true);
        tv.setVolume(86);
        tv.setOn(false);
        tv.setVolume(19);
        tv.setOn(true);
        assertEquals(86, tv.getVolume());
    }

}
