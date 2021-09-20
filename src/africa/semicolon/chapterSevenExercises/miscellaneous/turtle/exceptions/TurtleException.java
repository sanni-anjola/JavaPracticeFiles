package africa.semicolon.chapterSevenExercises.miscellaneous.turtle.exceptions;

public class TurtleException extends Exception{
    public TurtleException() {
    }

    public TurtleException(String message) {
        super(message);
    }

    public TurtleException(String message, Throwable cause) {
        super(message, cause);
    }

    public TurtleException(Throwable cause) {
        super(cause);
    }
}
