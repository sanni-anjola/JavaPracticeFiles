package africa.semicolon.chapterSevenExercises;

public class MyTurtle {
    private final char[][] sketchPad;
    private final int[] currentPosition;
    private final int[] finalPosition;
    private String currentDirection;
    private boolean penUp;

    public MyTurtle() {
        sketchPad = new char[20][20];
        currentPosition = new int[2];
        finalPosition = new int[2];
        currentDirection = "EAST";
        penUp = true;
    }

    public int[] getCurrentPosition() {
        return currentPosition;
    }

    public boolean isABoundary(int row, int col){
        return row > 19 || row < 0 || col > 19 || col < 0;
    }
    public boolean isCellEmpty(int row, int col){
        return sketchPad[row][col] == '\u0000';
    }

    public boolean isPenUp() {
        return penUp;
    }

    public void setPenUp(boolean penUp) {
        this.penUp = penUp;
    }


    public int[] getFinalPosition() {
        return finalPosition;
    }

    private void move(int steps, String currentDirection){
        currentPosition[0] = finalPosition[0];;
        currentPosition[1] = finalPosition[1];;
        if(steps > 0 ){
            if(currentDirection.equalsIgnoreCase("EAST")) finalPosition[1] += steps;
            if(currentDirection.equalsIgnoreCase("WEST")) finalPosition[1] -= steps;
            if(currentDirection.equalsIgnoreCase("SOUTH")) finalPosition[0] += steps;
            if(currentDirection.equalsIgnoreCase("NORTH")) finalPosition[0] -= steps;
        }
        if(isABoundary(finalPosition[0], finalPosition[1])){
            finalPosition[0] = currentPosition[0];
            finalPosition[1] = currentPosition[1];
        }
    }

    public void moveForward(int steps){
        move(steps, currentDirection);
    }

    public void turnLeft(){
        if(currentDirection.equalsIgnoreCase("SOUTH")) currentDirection = "EAST";
        else if(currentDirection.equalsIgnoreCase("WEST")) currentDirection = "SOUTH";
        else if(currentDirection.equalsIgnoreCase("NORTH")) currentDirection = "WEST";
        else if(currentDirection.equalsIgnoreCase("EAST")) currentDirection = "NORTH";
    }

    public void turnRight(){
        if(currentDirection.equalsIgnoreCase("EAST")) currentDirection = "SOUTH";
        else if(currentDirection.equalsIgnoreCase("SOUTH")) currentDirection = "WEST";
        else if(currentDirection.equalsIgnoreCase("WEST")) currentDirection = "NORTH";
        else if(currentDirection.equalsIgnoreCase("NORTH")) currentDirection = "EAST";
    }

    public String getCurrentDirection(){
        return this.currentDirection;
    }

    public void writeOnSketchPad(){
        int rowMovement = finalPosition[0] - currentPosition[0];
        int columnMovement = finalPosition[1] - currentPosition[1];

        if(rowMovement > 0 && !isPenUp()){
            for(int i = currentPosition[0]; i < finalPosition[0]; i++){
                sketchPad[i][finalPosition[1]] = '*';
            }
        }

        if(columnMovement > 0 && !isPenUp()){
            for(int i = currentPosition[1]; i < finalPosition[1]; i++){
                sketchPad[finalPosition[0]][i] = '*';
            }
        }

        if(rowMovement < 0 && !isPenUp()){
            for(int i = currentPosition[0]; i > finalPosition[0]; i--){
                sketchPad[i][finalPosition[1]] = '*';
            }
        }

        if(columnMovement < 0 && !isPenUp()){
            for(int i = currentPosition[1]; i > finalPosition[1]; i--){
                sketchPad[finalPosition[0]][i] = '*';
            }
        }
    }
    public StringBuilder getSketchPad(){
        StringBuilder stringBuilder = new StringBuilder("-".repeat(81)+"\n");

        for(char[] row : sketchPad){
            for (char col : row){
                stringBuilder.append("| ");
                if(col == '\u0000') stringBuilder.append("  ");
                else stringBuilder.append(col).append(" ");
            }

            stringBuilder.append("|\n").append("-".repeat(81)).append("\n");
        }

        return stringBuilder;
    }

}
