package africa.semicolon.chapterSevenExercises.turtleGraphics;

public class Pen {
    private PenPosition penPosition;

    public Pen() {
        this.penPosition = PenPosition.UP;
    }

    public PenPosition getPosition() {
        return this.penPosition;
    }

    public void setPosition(PenPosition down) {
        this.penPosition = down;
    }
}
