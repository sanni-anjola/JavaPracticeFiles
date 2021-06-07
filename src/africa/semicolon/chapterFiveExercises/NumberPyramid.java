package africa.semicolon.chapterFiveExercises;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int userInput = scanner.nextInt();

        for (int outerLoop = 1; outerLoop <= userInput ; outerLoop++) {

            for (int space = 1; space <= userInput - outerLoop; space++) {
                System.out.printf("%4s", " ");
            }
            for (int decreasingNumber = outerLoop; decreasingNumber >= 2 ; decreasingNumber--) {
                System.out.printf("%4d", decreasingNumber);

            }
            for (int increasingNumber = 1; increasingNumber <= outerLoop; increasingNumber++) {
                System.out.printf("%4d", increasingNumber);
            }
            System.out.println();
        }
    }
}
