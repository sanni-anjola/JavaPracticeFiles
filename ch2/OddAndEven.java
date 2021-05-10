import java.util.Scanner;

public class OddAndEven{

    public static void main(String... args){
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = userInput.nextInt();
        
        if(number % 2 == 0) System.out.printf("%d is an Even number%n", number);
        if(number % 2 != 0) System.out.printf("%d is an Odd number%n", number);
        
    }
}
