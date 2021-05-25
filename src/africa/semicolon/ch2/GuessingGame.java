package africa.semicolon.ch2;

import java.util.Scanner;

public class GuessingGame{
    public static void main(String... args){
        
        System.out.println("This is a guessing game. You have just 3 guesses");
        
        int magicNumber = 50;
        int userGuess;
        int placeholder = 0;
        Scanner getUserInput = new Scanner(System.in);
        
        System.out.print("Guess a number: ");
        userGuess = getUserInput.nextInt();
        
        if(userGuess == magicNumber) placeholder = 1;
        if (userGuess < magicNumber) {
            System.out.printf("%d is too low, please try again; you have 2 more guesses%n", userGuess);
        }
        if (userGuess > magicNumber) {
            System.out.printf("%d is too high, please try again; you have 2 more guesses%n", userGuess);
        }
        
        if(placeholder == 0){
            System.out.print("Guess a number: ");
            userGuess = getUserInput.nextInt();
        }
        
        if(userGuess == magicNumber) placeholder = 1;
        if (userGuess < magicNumber) {
            System.out.printf("%d is too low, please try again; you have 1 more guess%n", userGuess);
        }
        if (userGuess > magicNumber) {
            System.out.printf("%d is too high, please try again; you have 1 more guess%n", userGuess);
        }
        
        if(placeholder == 0){
            System.out.print("Guess a number: ");
            userGuess = getUserInput.nextInt();
        }
        if(userGuess == magicNumber) placeholder = 1;
        if (userGuess != magicNumber) {
            System.out.printf("%d is wrong, the secret number is %d.%nGame Over!!!%n", userGuess, magicNumber);
        }

        
        if(placeholder == 1) System.out.println("Wow!, You guessed right. Good job.");
    }
}
