package africa.semicolon.chapterFourExercises;

import java.util.Scanner;

public class LargestAndLowest {
    public static void main(String[] args) {
        int largestnumberSofar = Integer.MIN_VALUE;
        int smallestNumberSoFar = Integer.MAX_VALUE;

        int count = 1;

        Scanner scanner = new Scanner(System.in);
        while (count <= 10){
            System.out.printf("Enter number %d: ", count);
            int userInput = scanner.nextInt();
            if(userInput > largestnumberSofar) largestnumberSofar = userInput;
            if(userInput < smallestNumberSoFar) smallestNumberSoFar = userInput;

            count++;
        }

        System.out.println("The largest number is "+ largestnumberSofar);
        System.out.println("The smallest number is "+ smallestNumberSoFar);
    }
}
