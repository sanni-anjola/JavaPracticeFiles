package africa.semicolon.chapterSevenExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTurtleTest {

    @Test
    void canReturnSketchPad(){
        MyTurtle myTurtle = new MyTurtle();
        System.out.println(myTurtle.getSketchPad());
    }

    @Test
    void directionShouldBeEastWhenGameStarts(){
        MyTurtle turtle = new MyTurtle();
        assertEquals("EAST", turtle.getCurrentDirection());
    }

    @Test
    void myTurtleCanTurnLeft(){
        MyTurtle turtle = new MyTurtle();
        assertEquals("EAST", turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals("NORTH", turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals("WEST", turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals("SOUTH", turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals("EAST", turtle.getCurrentDirection());
    }

    @Test
    void myTurtleCanTurnRight(){
        MyTurtle turtle = new MyTurtle();
        assertEquals("EAST", turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals("SOUTH", turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals("WEST", turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals("NORTH", turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals("EAST", turtle.getCurrentDirection());
    }

    @Test
    void myTurtleCanMoveForwardWhenFacingEAST(){
        MyTurtle turtle = new MyTurtle();
        turtle.moveForward(10);
        assertArrayEquals(new int[]{0,10},turtle.getFinalPosition());

        turtle.moveForward(5);
        assertArrayEquals(new int[]{0,15},turtle.getFinalPosition());

    }

    @Test
    void myTurtleCanMoveForwardWhenFacingSOUTH(){
        MyTurtle turtle = new MyTurtle();
        turtle.moveForward(10);
        assertArrayEquals(new int[]{0,10},turtle.getFinalPosition());

        turtle.moveForward(5);
        assertArrayEquals(new int[]{0,15},turtle.getFinalPosition());

        turtle.turnRight();
        assertEquals("SOUTH",turtle.getCurrentDirection());
        turtle.moveForward(5);
        assertArrayEquals(new int[]{5,15},turtle.getFinalPosition());
    }

    @Test
    void myTurtleCanMoveForwardWhenFacingWEST(){
        MyTurtle turtle = new MyTurtle();
        turtle.moveForward(10);
        assertArrayEquals(new int[]{0,10},turtle.getFinalPosition());

        turtle.moveForward(5);
        assertArrayEquals(new int[]{0,15},turtle.getFinalPosition());

        turtle.turnRight();
        assertEquals("SOUTH",turtle.getCurrentDirection());
        turtle.moveForward(5);
        assertArrayEquals(new int[]{5,15},turtle.getFinalPosition());

        turtle.turnRight();
        assertEquals("WEST",turtle.getCurrentDirection());
        turtle.moveForward(5);
        assertArrayEquals(new int[]{5,10},turtle.getFinalPosition());
    }

    @Test
    void myTurtleCanMoveForwardWhenFacingNORTH(){
        MyTurtle turtle = new MyTurtle();
        turtle.moveForward(10);
        assertArrayEquals(new int[]{0,10},turtle.getFinalPosition());

        turtle.moveForward(5);
        assertArrayEquals(new int[]{0,15},turtle.getFinalPosition());

        turtle.turnRight();
        assertEquals("SOUTH",turtle.getCurrentDirection());
        turtle.moveForward(5);
        assertArrayEquals(new int[]{5,15},turtle.getFinalPosition());

        turtle.turnRight();
        assertEquals("WEST",turtle.getCurrentDirection());
        turtle.moveForward(5);
        assertArrayEquals(new int[]{5,10},turtle.getFinalPosition());

        turtle.turnRight();
        assertEquals("NORTH",turtle.getCurrentDirection());
        turtle.moveForward(5);
        assertArrayEquals(new int[]{0,10},turtle.getFinalPosition());
    }

    @Test
    void canWriteOnSketchPad(){
        MyTurtle myTurtle = new MyTurtle();
        assertTrue(myTurtle.isCellEmpty(0,0));

        myTurtle.setPenUp(false);
        myTurtle.moveForward(5);
        myTurtle.writeOnSketchPad();

        assertFalse(myTurtle.isCellEmpty(0,0));
        myTurtle.moveForward(5);
        myTurtle.writeOnSketchPad();
        myTurtle.turnRight();

        myTurtle.moveForward(10);
        myTurtle.writeOnSketchPad();

        myTurtle.turnLeft();
        myTurtle.moveForward(5);
        myTurtle.writeOnSketchPad();
        myTurtle.moveForward(6);
        myTurtle.writeOnSketchPad();
        myTurtle.moveForward(3);
        myTurtle.writeOnSketchPad();
        System.out.println(myTurtle.getSketchPad());

    }

    @Test
    void canNotWriteBeyondSketchPadBoundaries(){
        MyTurtle myTurtle = new MyTurtle();
        assertTrue(myTurtle.isCellEmpty(0,0));
        myTurtle.setPenUp(false);
        myTurtle.turnLeft();
        myTurtle.moveForward(5);
        myTurtle.writeOnSketchPad();
        assertTrue(myTurtle.isCellEmpty(0,0));

    }
}