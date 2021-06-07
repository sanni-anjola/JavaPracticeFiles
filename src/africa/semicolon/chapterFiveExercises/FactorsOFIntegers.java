package africa.semicolon.chapterFiveExercises;

import java.util.Scanner;

public class FactorsOFIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive Integer: ");
        int userInput = scanner.nextInt();

        int divisor = 2;

        while (userInput != 1){

            if (userInput % divisor != 0){
                divisor++;
            }else {
                System.out.printf("%d ", divisor);
                userInput /= divisor;
            }

        }
        System.out.println();

    }
}
