package africa.semicolon.chapterSevenExercises.miscellaneous.turtle.entities;

import africa.semicolon.chapterSevenExercises.miscellaneous.turtle.enums.CardinalPoint;
import africa.semicolon.chapterSevenExercises.miscellaneous.turtle.enums.PenPosition;
import africa.semicolon.chapterSevenExercises.miscellaneous.turtle.exceptions.TurtleException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

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

    @Test
    void moveForwardFromEast() throws TurtleException {
        assertEquals(BigInteger.ZERO.intValue(), ijapa.getXCoordinate());
        assertEquals(BigInteger.ZERO.intValue(), ijapa.getYCoordinate());
        assertEquals(CardinalPoint.EAST, ijapa.getDirection());
        ijapa.moveForward(12);
        assertEquals(BigInteger.valueOf(11).intValue(), ijapa.getXCoordinate());
        assertEquals(BigInteger.ZERO.intValue(), ijapa.getYCoordinate());

    }

    @Test
    void moveForwardFromSouth() throws TurtleException {
        assertEquals(BigInteger.ZERO.intValue(), ijapa.getXCoordinate());
        assertEquals(BigInteger.ZERO.intValue(), ijapa.getYCoordinate());
        assertEquals(CardinalPoint.EAST, ijapa.getDirection());
        ijapa.moveForward(12);
        assertEquals(BigInteger.valueOf(11).intValue(), ijapa.getXCoordinate());
        assertEquals(BigInteger.ZERO.intValue(), ijapa.getYCoordinate());

        ijapa.turnRight();
        assertEquals(CardinalPoint.SOUTH, ijapa.getDirection());
        ijapa.moveForward(12);
        assertEquals(BigInteger.valueOf(11).intValue(), ijapa.getXCoordinate());
        assertEquals(BigInteger.valueOf(11).intValue(), ijapa.getYCoordinate());


    }


    @Test
    void moveForwardFromWEST() throws TurtleException {
        assertEquals(BigInteger.ZERO.intValue(), ijapa.getXCoordinate());
        assertEquals(BigInteger.ZERO.intValue(), ijapa.getYCoordinate());
        assertEquals(CardinalPoint.EAST, ijapa.getDirection());
        ijapa.moveForward(12);
        assertEquals(BigInteger.valueOf(11).intValue(), ijapa.getXCoordinate());
        assertEquals(BigInteger.ZERO.intValue(), ijapa.getYCoordinate());

        ijapa.turnRight();
        assertEquals(CardinalPoint.SOUTH, ijapa.getDirection());
        ijapa.moveForward(12);
        assertEquals(BigInteger.valueOf(11).intValue(), ijapa.getXCoordinate());
        assertEquals(BigInteger.valueOf(11).intValue(), ijapa.getYCoordinate());


        ijapa.turnRight();
        assertEquals(CardinalPoint.WEST, ijapa.getDirection());
        ijapa.moveForward(12);
        assertEquals(BigInteger.ZERO.intValue(), ijapa.getXCoordinate());
        assertEquals(BigInteger.valueOf(11).intValue(), ijapa.getYCoordinate());
    }

    @Test
    void moveForwardFromNorth() throws TurtleException {
        assertEquals(BigInteger.ZERO.intValue(), ijapa.getXCoordinate());
        assertEquals(BigInteger.ZERO.intValue(), ijapa.getYCoordinate());
        assertEquals(CardinalPoint.EAST, ijapa.getDirection());
        ijapa.moveForward(12);
        assertEquals(BigInteger.valueOf(11).intValue(), ijapa.getXCoordinate());
        assertEquals(BigInteger.ZERO.intValue(), ijapa.getYCoordinate());

        ijapa.turnRight();
        assertEquals(CardinalPoint.SOUTH, ijapa.getDirection());
        ijapa.moveForward(12);
        assertEquals(BigInteger.valueOf(11).intValue(), ijapa.getXCoordinate());
        assertEquals(BigInteger.valueOf(11).intValue(), ijapa.getYCoordinate());


        ijapa.turnRight();
        assertEquals(CardinalPoint.WEST, ijapa.getDirection());
        ijapa.moveForward(12);
        assertEquals(BigInteger.ZERO.intValue(), ijapa.getXCoordinate());
        assertEquals(BigInteger.valueOf(11).intValue(), ijapa.getYCoordinate());

        ijapa.turnRight();
        assertEquals(CardinalPoint.NORTH, ijapa.getDirection());
        ijapa.moveForward(12);
        assertEquals(BigInteger.ZERO.intValue(), ijapa.getXCoordinate());
        assertEquals(BigInteger.ZERO.intValue(), ijapa.getYCoordinate());
    }

    @Test
    void moveForwardExcessSteps(){
        assertEquals(0, ijapa.getXCoordinate());
        assertEquals(0, ijapa.getYCoordinate());
        assertEquals(CardinalPoint.EAST, ijapa.getDirection());

        ijapa.turnLeft();
        assertEquals(CardinalPoint.NORTH, ijapa.getDirection());
        TurtleException ex = assertThrows(TurtleException.class, () -> ijapa.moveForward(10));
        assertEquals("You cannot move beyond the boundaries", ex.getMessage());
    }

}