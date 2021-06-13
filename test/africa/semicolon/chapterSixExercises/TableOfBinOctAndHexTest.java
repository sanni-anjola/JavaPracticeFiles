package africa.semicolon.chapterSixExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableOfBinOctAndHexTest {

    @Test
    void testThatDecToAnyBaseWorksForBase2(){
        String bin = TableOfBinOctAndHex.decToAnyBase(7, 2);
        assertEquals("111", bin);
        bin = TableOfBinOctAndHex.decToAnyBase(16, 2);
        assertEquals("10000", bin);
    }

    @Test
    void testThatDecToAnyBaseWorksForBase8(){
        String oct = TableOfBinOctAndHex.decToAnyBase(789, 8);
        assertEquals("1425", oct);
        oct = TableOfBinOctAndHex.decToAnyBase(16, 8);
        assertEquals("20", oct);
        System.out.println(TableOfBinOctAndHex.decToAnyBase(255,16));
    }

    @Test
    void testThatDecToAnyBaseWorksForBase16(){
        String hex = TableOfBinOctAndHex.decToAnyBase(789, 16);
        assertEquals("315", hex);
        hex = TableOfBinOctAndHex.decToAnyBase(255,16 );
        assertEquals("FF", hex);
        hex = TableOfBinOctAndHex.decToAnyBase(1023,16 );
        assertEquals("3FF", hex);
    }
}