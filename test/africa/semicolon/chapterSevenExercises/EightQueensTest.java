package africa.semicolon.chapterSevenExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EightQueensTest {
    private EightQueens eightQueens;
    @BeforeEach
    void setUp(){
        eightQueens = new EightQueens();
    }

    @Test
    void testThatEightQueensHasABoard(){
        String emptyBoard = """
                ---------------------------------
                |   |   |   |   |   |   |   |   |
                ---------------------------------
                |   |   |   |   |   |   |   |   |
                ---------------------------------
                |   |   |   |   |   |   |   |   |
                ---------------------------------
                |   |   |   |   |   |   |   |   |
                ---------------------------------
                |   |   |   |   |   |   |   |   |
                ---------------------------------
                |   |   |   |   |   |   |   |   |
                ---------------------------------
                |   |   |   |   |   |   |   |   |
                ---------------------------------
                |   |   |   |   |   |   |   |   |
                ---------------------------------
                """;
        assertEquals(emptyBoard, eightQueens.displayBoard());
    }

    @Test
    void testThatACellCanBeFilledWithAQueen(){
        String filledCell54 = """
                ---------------------------------
                |   |   |   |   | X |   |   |   |
                ---------------------------------
                | X |   |   |   | X |   |   |   |
                ---------------------------------
                |   | X |   |   | X |   |   | X |
                ---------------------------------
                |   |   | X |   | X |   | X |   |
                ---------------------------------
                |   |   |   | X | X | X |   |   |
                ---------------------------------
                | X | X | X | X | Q | X | X | X |
                ---------------------------------
                |   |   |   | X | X | X |   |   |
                ---------------------------------
                |   |   | X |   | X |   | X |   |
                ---------------------------------
                """;
        eightQueens.fillCell(5,4);
        assertEquals(filledCell54, eightQueens.displayBoard());
    }

    @Test
    void testThatEightQueensCanDetermineEmptyCell(){
        eightQueens.fillCell(5, 5);

        assertFalse(eightQueens.isCellEmpty(5, 5));
        assertTrue(eightQueens.isCellEmpty(4, 0));
    }

    @Test
    void testThatQueensCanBePlaced(){
        eightQueens.placeQueens(0,0);
        assertFalse(eightQueens.isBoardEmpty());
    }

    @Test
    void testThatQueensCanBeCounted(){
        eightQueens.placeQueens(0,0);
        assertEquals(5, eightQueens.countQueensPosition());
    }

    @Test
    void testThatBoardCanReset(){
        eightQueens.placeQueens(0,0);
        assertEquals(5, eightQueens.countQueensPosition());
        eightQueens.resetBoard();
        assertEquals(0, eightQueens.countQueensPosition());

    }

    @Test
    void testThatEightQueensCanCheckIfBoardIsFilled(){
        eightQueens.placeQueens(0,0);
        assertTrue(eightQueens.isBoardFilled());
        eightQueens.resetBoard();

        eightQueens.placeQueens(3,5);
        System.out.println(eightQueens.displayBoard());
        System.out.println(eightQueens.countQueensPosition());
        assertTrue(eightQueens.isBoardFilled());
        eightQueens.resetBoard();
    }

    @Test
    void testThatEightQueensCanBePlaced(){
        eightQueens.placeEightQueens();
        assertEquals(8, eightQueens.countQueensPosition());

    }
}