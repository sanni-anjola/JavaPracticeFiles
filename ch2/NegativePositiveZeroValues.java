import java.util.Scanner;

public class NegativePositiveZeroValues{
    public static void main(String... args){
        int firstInput;
        int secondInput;
        int thirdInput;
        int fourthInput;
        int fifthInput;
        int zeroCounter = 0, positiveCounter = 0, negativeCounter = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        firstInput = input.nextInt();
        System.out.print("Enter the second number: ");
        secondInput = input.nextInt();
        System.out.print("Enter the third number: ");
        thirdInput = input.nextInt();
        System.out.print("Enter the fourth number: ");
        fourthInput = input.nextInt();
        System.out.print("Enter the fifth number: ");
        fifthInput = input.nextInt();
        
        if(firstInput > 0) positiveCounter = positiveCounter + 1;
        if(secondInput > 0) positiveCounter = positiveCounter + 1;
        if(thirdInput > 0) positiveCounter = positiveCounter + 1;
        if(fourthInput > 0) positiveCounter = positiveCounter + 1;
        if(fifthInput > 0) positiveCounter = positiveCounter + 1;
        
        if(firstInput < 0) negativeCounter = negativeCounter + 1;
        if(secondInput < 0) negativeCounter = negativeCounter + 1;
        if(thirdInput < 0) negativeCounter = negativeCounter + 1;
        if(fourthInput < 0) negativeCounter = negativeCounter + 1;
        if(fifthInput < 0) negativeCounter = negativeCounter + 1;
        
        if(firstInput == 0) zeroCounter = zeroCounter + 1;
        if(secondInput == 0) zeroCounter = zeroCounter + 1;
        if(thirdInput == 0) zeroCounter = zeroCounter + 1;
        if(fourthInput == 0) zeroCounter = zeroCounter + 1;
        if(fifthInput == 0) zeroCounter = zeroCounter + 1;
        
        System.out.printf("%d Zero(s), %d Positive(s) and %d Negative(S)%n", zeroCounter, positiveCounter, negativeCounter);
    }
}
