package africa.semicolon.chapterSixExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    @Test
    void testThatGcdReturnsTheGcdOfGivenValues(){
        // given
        GreatestCommonDivisor gcd = new GreatestCommonDivisor();
        assertEquals(5, gcd.gcd(10, 15));
        assertEquals(21, gcd.gcd(252, 105));
    }

}