package africa.semicolon.chapterFourExercises;

import java.util.Scanner;

public class LargestTwoNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int largest = input.nextInt();
        int temp = Integer.MIN_VALUE;
        int larger = Integer.MIN_VALUE;
        int number;
        int count = 2;

        while (count <= 10){
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if(number > largest){
                temp = largest;
                largest = number;
            }else{
                if(number > larger){
                    larger = number;
                }
            }
            count++;

        }
        System.out.println("largest number is: " + largest);
        System.out.println("second largest number is: " + Math.max(larger, temp));
    }
}
