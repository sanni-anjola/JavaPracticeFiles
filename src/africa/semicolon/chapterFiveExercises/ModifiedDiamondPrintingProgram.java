package africa.semicolon.chapterFiveExercises;

public class ModifiedDiamondPrintingProgram {
    public String displayDiamond(int numberOfRows) {
        StringBuilder output = new StringBuilder();

        if(numberOfRows >= 1 && numberOfRows <= 19 && numberOfRows % 2 != 0){
            for(int i = 1; i < 2*numberOfRows; i+=2){
                int maxKPerLoop = Math.abs(numberOfRows - i) / 2;
                output.append(" ".repeat(Math.max(0, maxKPerLoop)));
                output.append("*".repeat(Math.max(0, numberOfRows - (int) Math.abs(numberOfRows - i))));
                output.append("\n");
            }
        }

        return output.toString();
    }
}
