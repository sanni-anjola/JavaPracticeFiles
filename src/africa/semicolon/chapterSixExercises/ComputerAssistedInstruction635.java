package africa.semicolon.chapterSixExercises;

import java.security.SecureRandom;

public class ComputerAssistedInstruction635 {
    static int[] values;
    private static final String[] responses = {"Very good!", "Excellent!", "Nice Work!", "Keep up the good work!",
    "No. Please try again", "Wrong. Try once more.", "Don't give up!", "No. Keep trying."};
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

    public static String getGoodResponse(){
        SecureRandom random = new SecureRandom();
        return responses[random.nextInt(4)];
    }

    public static String getResponse(){
        SecureRandom random = new SecureRandom();
        return responses[4 + random.nextInt(4)];
    }
}
