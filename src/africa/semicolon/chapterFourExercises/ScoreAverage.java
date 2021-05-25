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
        int score;
        int count = 0;
        int sum = 0;
        StringBuilder out = new StringBuilder();
        double numberOfTimes;
        Scanner scanner = new Scanner(System.in);
        System.out.print("How students do you have: ");
        numberOfTimes = scanner.nextDouble();
        while (count < numberOfTimes){
            System.out.print("Enter a score: ");
            score = scanner.nextInt();
            if(count == 0){
                out.append(score);
            }else{
                out.append(" + ").append(score);
            }
            sum += score;

            count++;
        }

        System.out.printf("%s = %d%n", out.toString(), sum);
        System.out.printf("The Sum of the %.0f Scores is %d%n",numberOfTimes, sum);
        System.out.printf("The average of the Scores is %.2f%n", sum / numberOfTimes);
    }
}
