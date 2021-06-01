package africa.semicolon.chapterFiveExercises;

public class TrianglePattern {


    public String pattern1(int numberOfRows) {
        String pattern = "";
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                pattern += "*";
            }
            pattern += "\n";
        }
        return pattern;
    }

    public String pattern2(int numberOfRows) {
        String pattern = "";

        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                pattern += "*";
            }
            pattern += "\n";
        }
        return pattern;
    }

    public String pattern3(int numberOfRows) {
        String pattern = "";

        for (int i = numberOfRows; i >= 1; i--) {
            for (int k = 1; k <= numberOfRows - i; k++) {
                pattern += " ";
            }
            for (int j = 1; j <= i; j++) {
                pattern += "*";
            }
            pattern += "\n";
        }
        return pattern;
    }

    public String pattern4(int numberOfRows) {
        String pattern = "";

        for (int i = 1; i <= numberOfRows; i++) {
            for (int k = 1; k <= numberOfRows - i; k++) {
                pattern += " ";
            }
            for (int j = 1; j <= i; j++) {
                pattern += "*";
            }
            pattern += "\n";
        }
        return pattern;
    }
}
