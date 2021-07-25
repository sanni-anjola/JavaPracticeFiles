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
        else if(direction == Direction.WEST) direction = Direction.NORTH;
        else if(direction == Direction.NORTH) direction = Direction.EAST;
        else if(direction == Direction.EAST) direction = Direction.SOUTH;
    }

    public void turnLeft() {
        if(direction == Direction.EAST) direction = Direction.NORTH;
        else if(direction == Direction.NORTH) direction = Direction.WEST;
        else if(direction == Direction.WEST) direction = Direction.SOUTH;
        else if(direction == Direction.SOUTH) direction = Direction.EAST;

    }

    public TurtlePosition getTurtlePosition() {
        return this.turtlePosition;
    }

    public void move(int numberOfSteps) {
        if (direction == Direction.EAST) turtlePosition.increaseColumnPositionBy(numberOfSteps - 1);
        if (direction == Direction.SOUTH) turtlePosition.increaseRowPositionBy(numberOfSteps);
    }


    public void move(int numberOfSteps, SketchPad sketchPad) {
        if(pen.getPosition().equals(PenPosition.DOWN)){
            int columnPosition = turtlePosition.getColumnPosition();
            int rowPosition = turtlePosition.getRowPosition();
            switch (direction){
                case EAST -> {
                    for (int i = columnPosition; i < columnPosition + numberOfSteps; i++) {
                        sketchPad.getFloor()[rowPosition][i] = 1;
                    }
                }
            }
        }
        move(numberOfSteps);
    }
}
