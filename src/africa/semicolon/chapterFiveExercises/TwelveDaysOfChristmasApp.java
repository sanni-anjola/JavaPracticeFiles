package africa.semicolon.chapterFiveExercises;

import java.util.Scanner;

public class TwelveDaysOfChristmasApp {
    public static void main(String[] args) {
        TwelveDaysOfChristmas sing = new TwelveDaysOfChristmas();
        Scanner scanner = new Scanner(System.in);
        int userInput;

        do {
            System.out.println("Type between 1 and 12 for the Christmas Song or -1 to exit");
            userInput = scanner.nextInt();
            System.out.println(sing.sing(userInput));
        }while (userInput != -1);
    }
}
