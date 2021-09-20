package africa.semicolon.chapterSevenExercises.miscellaneous.turtle.entities;

import africa.semicolon.chapterSevenExercises.miscellaneous.turtle.enums.CardinalPoint;
import africa.semicolon.chapterSevenExercises.miscellaneous.turtle.enums.PenPosition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    private Turtle ijapa;

    @BeforeEach
    void setUp() {
        ijapa = new Turtle("Ijapa");
    }

    @Test
    void changePenPositionFromUpToDown(){
        assertEquals(PenPosition.UP, ijapa.getPen().getPenPosition());
        ijapa.changePenPosition(PenPosition.DOWN);
        assertEquals(PenPosition.DOWN, ijapa.getPen().getPenPosition());
        ijapa.changePenPosition(PenPosition.UP);
        assertEquals(PenPosition.UP, ijapa.getPen().getPenPosition());
    }

    @Test
    void turnRightFromEast(){
        assertEquals(CardinalPoint.EAST, ijapa.getDirection());
        ijapa.turnRight();
        assertEquals(CardinalPoint.SOUTH, ijapa.getDirection());
    }

    @Test
    void turnLeftFromEast(){
        assertEquals(CardinalPoint.EAST, ijapa.getDirection());
        ijapa.turnLeft();
        assertEquals(CardinalPoint.NORTH, ijapa.getDirection());
    }



}