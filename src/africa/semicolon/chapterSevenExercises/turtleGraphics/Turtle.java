package africa.semicolon.chapterSevenExercises.turtleGraphics;

public class Turtle {
    private Pen pen;

    public Turtle(){
        pen = new Pen();
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public Pen getPen() {
        return this.pen;
    }
}
