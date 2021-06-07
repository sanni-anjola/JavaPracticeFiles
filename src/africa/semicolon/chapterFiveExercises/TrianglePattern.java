package africa.semicolon.chapterFiveExercises;

public class TrianglePattern {


    public String pattern1(int numberOfRows) {
        StringBuilder pattern = new StringBuilder();
        for (int i = 1; i <= numberOfRows; i++) {
            pattern.append("*".repeat(Math.max(0, i)));
            pattern.append("\n");
        }
        return pattern.toString();
    }

    public String pattern2(int numberOfRows) {
        StringBuilder pattern = new StringBuilder();

        for (int i = numberOfRows; i >= 1; i--) {
            pattern.append("*".repeat(i));
            pattern.append("\n");
        }
        return pattern.toString();
    }

    public String pattern3(int numberOfRows) {
        StringBuilder pattern = new StringBuilder();

        for (int i = numberOfRows; i >= 1; i--) {
            pattern.append(" ".repeat(Math.max(0, numberOfRows - i)));
            pattern.append("*".repeat(i));
            pattern.append("\n");
        }
        return pattern.toString();
    }

    public String pattern4(int numberOfRows) {
        StringBuilder pattern = new StringBuilder();

        for (int i = 1; i <= numberOfRows; i++) {
            pattern.append(" ".repeat(Math.max(0, numberOfRows - i)));
            pattern.append("*".repeat(Math.max(0, i)));
            pattern.append("\n");
        }
        return pattern.toString();
    }

    public String allPatterns(int numberOfRows){
        StringBuilder pattern = new StringBuilder();
        final int SPACE = 5;
        for(int i = 1; i <= numberOfRows; i++){
            pattern.append("*".repeat(Math.max(0, i)));
            String repeatSpace = " ".repeat(Math.max(0, (numberOfRows - i) + SPACE));
            pattern.append(repeatSpace);
            String repeatCharacter = "*".repeat(Math.max(0, numberOfRows + 1 - i));
            pattern.append(repeatCharacter);
            pattern.append(" ".repeat(Math.max(0, SPACE + 2 * (i - 1))));
            pattern.append(repeatCharacter);

            pattern.append(repeatSpace);

            pattern.append("*".repeat(Math.max(0, i)));

            pattern.append("\n");
        }
        return pattern.toString();
    }

}
