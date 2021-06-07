package africa.semicolon.chapterFourExercises;

import java.util.Scanner;

public class SentinelWhile {
    public static void main(String[] args) {
        int score = 0;
        int count = 0;
        int sum = 0;
        StringBuilder out = new StringBuilder();

        System.out.println("Enter score or -1 to exit");
        Scanner userInput = new Scanner(System.in);
        while (score != -1) {
            System.out.printf("Enter a score %d: ", count + 1);
            score = userInput.nextInt();
            if (score != -1) {
                if (count == 0) {
                    out.append(score);
                } else {
                    out.append(" + ").append(score);
                }
                sum += score;

                count++;
            }
        }

        System.out.printf("%s = %d%n", out, sum);
        System.out.printf("The Sum of the %d Scores is %d%n",count, sum);
        System.out.printf("The average of the Scores is %.2f%n", sum * 1.0 / count);

    }
}
