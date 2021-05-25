package africa.semicolon.ch2;

import java.util.Scanner;

public class Multiple{

    public static void main(String... args){
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int firstInput = userInput.nextInt();
        System.out.print("Enter the second number: ");
        int secondInput = userInput.nextInt();
        
        if(firstInput % secondInput == 0) System.out.printf("%d is a multiple of %d%n", firstInput, secondInput);
        if(firstInput % secondInput != 0) System.out.printf("%d is not a multiple of %d%n", firstInput, secondInput);
        
    }
}
