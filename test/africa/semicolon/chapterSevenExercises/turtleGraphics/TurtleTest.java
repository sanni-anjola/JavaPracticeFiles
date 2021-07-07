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

}