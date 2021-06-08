package africa.semicolon.chapterFourExercises;

import java.util.Scanner;

public class SquareAsterisks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 20: ");
        int userInput = scanner.nextInt();

        if(userInput > 1 && userInput <= 20){
            for (int i = 1; i <= userInput; i++) {
                System.out.print("* ");
                for (int j = 1; j <= userInput - 2; j++) {
                    if(i == 1 || i == userInput) {
                        System.out.print("* ");
                    }else {
                        System.out.print("  ");
                    }
                }
                System.out.println("*");

            }
        }else {
            System.out.println("Wrong option, try again");
        }
    }
}
