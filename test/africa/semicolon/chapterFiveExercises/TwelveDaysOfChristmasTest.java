package africa.semicolon.chapterFiveExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwelveDaysOfChristmasTest {
    private TwelveDaysOfChristmas sing;

    @BeforeEach
    void startAllTestsWithThis(){
        sing = new TwelveDaysOfChristmas();
    }

    @Test
    void testThatTwelveDaysOfChristmasSongSingsForDay12(){
        String output = """
                On the Twelfth day of Christmas, my true love sent to me
                Twelve drummers drumming
                Eleven pipers piping
                Ten lords a-leaping
                Nine ladies dancing
                Eight maids a-milking
                Seven swans a-swimming
                Six geese a-laying
                Five gold rings
                Four calling birds
                Three French Hens
                Two Turtle Doves
                and A partridge in a pear tree""";
        System.out.println(sing.sing(12));
        assertEquals(output, sing.sing(12));
    }

    @Test
    void testThatTwelveDaysOfChristmasSongSingsForDay1(){
        String output = """
               On the First day of Christmas, my true love sent to me
               A partridge in a pear tree""";
        System.out.println(sing.sing(1));
        assertEquals(output, sing.sing(1));
    }

    @Test
    void testThatTwelveDaysOfChristmasSongSingsForDay5(){
        String output = """
                On the Fifth day of Christmas, my true love sent to me
                Five gold rings
                Four calling birds
                Three French Hens
                Two Turtle Doves
                and A partridge in a pear tree""";
        assertEquals(output, sing.sing(5));
    }
}
