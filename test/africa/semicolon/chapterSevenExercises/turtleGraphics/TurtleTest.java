package africa.semicolon.chapterSevenExercises.turtleGraphics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    @Test
    void turtleCanBeCreated(){
        Turtle turtle = new Turtle();
        assertNotNull(turtle);
    }

    @Test
    void turtleCanChangePen(){
        Turtle turtle = new Turtle();
        Pen pen = new Pen();

        turtle.setPen(pen);
        assertSame(pen, turtle.getPen());
    }

    @Test
    void turtleHasPenOnCreation(){
        Turtle turtle = new Turtle();
        assertNotNull(turtle.getPen());
    }

    @Test
    void penHasAPositionTest(){
        Pen pen = new Pen();
        assertNotNull(pen.getPosition());
    }

    @Test
    void penPositionIsUpByDefault(){
        Pen pen = new Pen();
        assertSame(PenPosition.UP, pen.getPosition());
    }

    @Test
    void turtleCanTurnPenDown(){
        // given
        Turtle turtle = new Turtle();
        assertSame(PenPosition.UP, turtle.getPenPosition());
        // when
        turtle.penDown();
        //assert
        assertSame(PenPosition.DOWN, turtle.getPenPosition());
    }

    @Test
    void turtleCanTurnPenUp(){
        // given
        Turtle turtle = new Turtle();
        turtle.penDown();
        assertSame(PenPosition.DOWN, turtle.getPenPosition());
        // when
        turtle.penUp();
        //assert
        assertSame(PenPosition.UP, turtle.getPenPosition());
    }

    @Test
    void turtleCanRightWhenFacingEast(){
        // given
        Turtle turtle = new Turtle();
        assertSame(Direction.EAST, turtle.getDirection());
        // when
        turtle.turnRight();
        //assert
        assertSame(Direction.SOUTH, turtle.getDirection());
    }

    @Test
    void turtleCanRightWhenFacingSouth(){
        // given
        Turtle turtle = new Turtle();
        turtle.turnRight();
        assertSame(Direction.SOUTH, turtle.getDirection());
        // when
        turtle.turnRight();
        //assert
        assertSame(Direction.WEST, turtle.getDirection());
    }

    //todo facing west and facing north

    @Test
    void turtleCanLeftWhenFacingEast(){
        // given
        Turtle turtle = new Turtle();
        assertSame(Direction.EAST, turtle.getDirection());
        // when
        turtle.turnLeft();
        //assert
        assertSame(Direction.NORTH, turtle.getDirection());
    }

    //todo north, west, south

    @Test
    void turtleCanMoveForwardWhileFacingEastTest(){
        Turtle turtle = new Turtle();
        TurtlePosition position = turtle.getTurtlePosition();
        assertEquals(0, position.getColumnPosition());
        assertEquals(0, position.getRowPosition());
        //when
        turtle.move(5);
        TurtlePosition newPosition = turtle.getTurtlePosition();
        assertEquals(5, newPosition.getColumnPosition());
        assertEquals(0, newPosition.getRowPosition());
        //when
    }

    @Test
    void turtleCanMoveForwardWhileFacingSouthTest(){
        Turtle turtle = new Turtle();
        TurtlePosition position = turtle.getTurtlePosition();
        assertEquals(0, position.getColumnPosition());
        assertEquals(0, position.getRowPosition());
        turtle.turnRight();
        //when
        turtle.move(5);
        TurtlePosition newPosition = turtle.getTurtlePosition();
        assertEquals(0, newPosition.getColumnPosition());
        assertEquals(5, newPosition.getRowPosition());
        //when
    }

    @Test
    void turtleCanWriteEastWardWhenPenIsDownTest(){
        // given
        SketchPad sketchPad = new SketchPad(20, 20);
        Turtle turtle = new Turtle();
        turtle.penDown();

        // when
        turtle.move(5, sketchPad);

        //assert
        assertEquals(1, sketchPad.getFloor()[0][0]);
        assertEquals(1, sketchPad.getFloor()[0][1]);
        assertEquals(1, sketchPad.getFloor()[0][2]);
        assertEquals(1, sketchPad.getFloor()[0][3]);
        assertEquals(1, sketchPad.getFloor()[0][4]);
        assertEquals(0, sketchPad.getFloor()[0][5]);

        TurtlePosition turtlePosition = turtle.getTurtlePosition();
        assertEquals(4, turtlePosition.getColumnPosition());
        assertEquals(0, turtlePosition.getRowPosition());
    }
}