package africa.semicolon.chapterSevenExercises.miscellaneous.turtle.entities;

import africa.semicolon.chapterSevenExercises.miscellaneous.turtle.enums.CardinalPoint;
import africa.semicolon.chapterSevenExercises.miscellaneous.turtle.enums.PenPosition;

public class Turtle {
    private final String name;
    private Pen pen;
    private int xCoordinate;
    private int yCoordinate;
    private CardinalPoint direction;


    public Turtle(){
        this("Turtle", 0, 0);
    }

    public Turtle(String name) {
        this(name, 0, 0);
    }

    public Turtle(String name, int xCoordinate, int yCoordinate) {
        pen = new Pen();
        pen.setPenPosition(PenPosition.UP);
        direction = CardinalPoint.EAST;
        this.name = name;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public String getName() {
        return name;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public CardinalPoint getDirection() {
        return direction;
    }

    public void setDirection(CardinalPoint direction) {
        this.direction = direction;
    }

    public void changePenPosition(PenPosition newPenPosition){
        pen.setPenPosition(newPenPosition);
    }

    public void turnRight(){
        switch (direction){
            case EAST -> setDirection(CardinalPoint.SOUTH);
            case SOUTH -> setDirection(CardinalPoint.WEST);
            case WEST -> setDirection(CardinalPoint.NORTH);
            case NORTH -> setDirection(CardinalPoint.EAST);
        }
    }

    public void turnLeft(){
        switch (direction){
            case EAST -> setDirection(CardinalPoint.NORTH);
            case SOUTH -> setDirection(CardinalPoint.EAST);
            case WEST -> setDirection(CardinalPoint.SOUTH);
            case NORTH -> setDirection(CardinalPoint.WEST);
        }
    }

    public void moveForward(int numberOfSteps){

    }
}
