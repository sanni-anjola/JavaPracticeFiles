package africa.semicolon.chapterFiveExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModifiedDiamondPrintingProgramTest {
    private ModifiedDiamondPrintingProgram diamond;

    @BeforeEach
    void startEveryTestWithThis(){
        diamond = new ModifiedDiamondPrintingProgram();
    }

    @Test
    void testThatDiamondCanDisplayDiamondWith1Row(){
        String expectedOutput = "*\n";

        System.out.println(diamond.displayDiamond(1));
        assertEquals(expectedOutput, diamond.displayDiamond(1));
    }
    @Test
    void testThatDiamondCanDisplayDiamondWith3Row(){
        String expectedOutput = """
                 *
                ***
                 *
                """;
        System.out.println(diamond.displayDiamond(1));
        assertEquals(expectedOutput, diamond.displayDiamond(3));
    }
    @Test
    void testThatDiamondProgramCanDisplayDiamondWith9Rows(){
        String expectedOutput = """
                    *
                   ***
                  *****
                 *******
                *********
                 *******
                  *****
                   ***
                    *
                """;
        System.out.println(diamond.displayDiamond(3));
        assertEquals(expectedOutput, diamond.displayDiamond(9));

    }

    @Test
    void testThatProgramCanDisplayFor19Rows(){
        String expectedOutput = """
                         *
                        ***
                       *****
                      *******
                     *********
                    ***********
                   *************
                  ***************
                 *****************
                *******************
                 *****************
                  ***************
                   *************
                    ***********
                     *********
                      *******
                       *****
                        ***
                         *
                """;

        System.out.println(diamond.displayDiamond(19));
        assertEquals(expectedOutput, diamond.displayDiamond(19));
    }

    @Test
    void testThatProgramReturnsEmptyStringForAnyNumberOutsideTheOddNumbersBetween1And19(){
        assertEquals("", diamond.displayDiamond(-3));
        assertEquals("", diamond.displayDiamond(8));
        assertEquals("", diamond.displayDiamond(20));
        assertEquals("", diamond.displayDiamond(21));

    }
}
