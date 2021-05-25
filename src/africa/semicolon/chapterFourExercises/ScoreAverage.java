package africa.semicolon.chapterFourExercises;

import java.util.Scanner;

/*
set the counter to 0
set the sum to zero
while the scores entered is not up to 15
    obtain the scores
    add each score to sum
    increase the counter by one
display the sum
display the average

 */
public class ScoreAverage {
    public static void main(String[] args) {
        int count = 0;
        int score;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (count < 15){
            System.out.print("Enter a score: ");
            score = scanner.nextInt();
            sum += score;

            count++;
        }

        System.out.printf("The Sum of the 15 Scores is %d%n", sum);
        System.out.printf("The average of the Scores is %.2f%n", sum / 15.0);
    }
}
