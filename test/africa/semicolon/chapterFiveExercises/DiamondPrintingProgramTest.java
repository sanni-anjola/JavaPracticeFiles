package africa.semicolon.chapterFiveExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondPrintingProgramTest {
    @Test
    void testThatDiamondProgramCanDisplayDiamond(){
        DiamondPrintingProgram diamond = new DiamondPrintingProgram();
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
        System.out.println(diamond.displayDiamond());
        assertEquals(expectedOutput, diamond.displayDiamond());

    }


}
