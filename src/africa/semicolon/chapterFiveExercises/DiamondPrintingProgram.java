package africa.semicolon.chapterFiveExercises;

public class DiamondPrintingProgram {

    public String displayDiamond() {
        StringBuilder output = new StringBuilder();
        for(int i = 1; i <= 17; i+=2){
            int maxKPerLoop = Math.abs(17 / 2 + 1 - i) / 2;
            output.append(" ".repeat(Math.max(0, maxKPerLoop)));
            output.append("*".repeat(Math.max(0, 9 - (int) Math.abs(9 - i))));
            output.append("\n");
        }
        return output.toString();
    }
}
