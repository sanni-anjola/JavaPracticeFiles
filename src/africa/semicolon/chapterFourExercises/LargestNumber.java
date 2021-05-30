package africa.semicolon.chapterFourExercises;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int number = 0;
        int count = 1;

        while (count <= 10){
            count++;
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if(number > largest){
                largest = number;
            }
        }
        System.out.println("largest number is: " + largest);
    }
}
