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

    public String allPatterns(int numberOfRows){
        String pattern = "";
        final int SPACE = 5;
        for(int i = 1; i <= numberOfRows; i++){
            for (int j = 1; j <= i; j++){
                pattern += "*";
            }
            for (int k = 1; k <= (numberOfRows - i) + SPACE; k++){
                pattern += " ";
            }
            for (int j = 1; j <= numberOfRows + 1 - i; j++){
                pattern += "*";
            }
            for (int k = 1; k <= SPACE + 2 * (i - 1); k++){
                pattern += " ";
            }
            for (int j = 1; j <= numberOfRows + 1 - i; j++){
                pattern += "*";
            }

            for (int k = 1; k <= (numberOfRows - i) + SPACE; k++){
                pattern += " ";
            }

            for (int j = 1; j <= i; j++){
                pattern += "*";
            }

            pattern += "\n";
        }
        return pattern;
    }

}
