package africa.semicolon.chapterSixExercises;

import java.security.SecureRandom;

public class ComputerAssistedInstruction635 {
    static int[] values;
    private static void generateNumbers(){
        SecureRandom random = new SecureRandom();
        int number1 = 1 + random.nextInt(9);
        int number2 = 1 + random.nextInt(9);
        values = new int[]{number1, number2, number1 * number2};
    }

    public static String getQuestion(){
        generateNumbers();
        int number1 = values[0];
        int number2 = values[1];
        return String.format("How much is %d times %d? ", number1, number2);
    }

    public static boolean getAnswer(int answer){
        return answer == values[2];
    }
}
