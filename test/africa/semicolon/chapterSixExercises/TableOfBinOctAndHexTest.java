package africa.semicolon.chapterSixExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableOfBinOctAndHexTest {

    @Test
    void testThatDecToAnyBaseWorksForBase2(){
        String bin = TableOfBinOctAndHex.convertdecNumberToAnyBase(7, 2);
        assertEquals("111", bin);
        bin = TableOfBinOctAndHex.convertdecNumberToAnyBase(16, 2);
        assertEquals("10000", bin);
    }

    @Test
    void testThatDecToAnyBaseWorksForBase8(){
        String oct = TableOfBinOctAndHex.convertdecNumberToAnyBase(789, 8);
        assertEquals("1425", oct);
        oct = TableOfBinOctAndHex.convertdecNumberToAnyBase(16, 8);
        assertEquals("20", oct);
        System.out.println(TableOfBinOctAndHex.convertdecNumberToAnyBase(255,16));
    }

    @Test
    void testThatDecToAnyBaseWorksForBase16(){
        String hex = TableOfBinOctAndHex.convertdecNumberToAnyBase(789, 16);
        assertEquals("315", hex);
        hex = TableOfBinOctAndHex.convertdecNumberToAnyBase(255,16 );
        assertEquals("FF", hex);
        hex = TableOfBinOctAndHex.convertdecNumberToAnyBase(1023,16 );
        assertEquals("3FF", hex);
    }
}