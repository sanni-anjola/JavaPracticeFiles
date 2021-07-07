package africa.semicolon.chapterSevenExercises.turtleGraphics;

public class TurtlePosition {
    private int columnPosition;
    private int rowPosition;

    public int getColunmnPosition() {
        return this.columnPosition;
    }

    public int getRowPosition() {
        return this.rowPosition;
    }

    public void increaseColumnPositionBy(int numberOfSteps) {
        columnPosition += numberOfSteps;
    }

    public void increaseRowPositionBy(int numberOfSteps) {
        rowPosition += numberOfSteps;
    }
}

