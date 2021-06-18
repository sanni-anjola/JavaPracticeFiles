package africa.semicolon.chapterEightExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    private Time time;
    @BeforeEach
    void setUp(){
        time = new Time();
    }

    @Test
    void setTimeThrowsException_whenCalledWithInvalidTime(){
        assertThrows(IllegalArgumentException.class, () -> time.setTime(25,0,0), "Invalid");
        System.out.println(time);

        System.out.println(time.displayTime(25,0,0));
    }

}