package africa.semicolon.chapterSevenExercises.turtleGraphics;

public class Turtle {
    private Pen pen;
    private Direction direction;
    private TurtlePosition turtlePosition;

    public Turtle(){
        pen = new Pen();
        direction = Direction.EAST;
        turtlePosition = new TurtlePosition();
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public Pen getPen() {
        return this.pen;
    }

    public void penDown() {
        this.pen.setPosition(PenPosition.DOWN);

    }

    public PenPosition getPenPosition() {
        return pen.getPosition();
    }

    public void penUp() {
        this.pen.setPosition(PenPosition.UP);
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void turnRight() {
        if(direction == Direction.SOUTH) direction = Direction.WEST;
        if(direction == Direction.EAST) direction = Direction.SOUTH;
    }

    public void turnLeft() {
        if(direction == Direction.EAST) direction = Direction.NORTH;

    }

    public TurtlePosition getTurtlePosition() {
        return this.turtlePosition;
    }

    public void move(int numberOfSteps) {
        if (direction == Direction.EAST) turtlePosition.increaseColumnPositionBy(numberOfSteps);
        if (direction == Direction.SOUTH) turtlePosition.increaseRowPositionBy(numberOfSteps);
    }
}
