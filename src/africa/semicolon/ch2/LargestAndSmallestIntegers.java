package africa.semicolon.ch2;

import java.util.Scanner;

public class LargestAndSmallestIntegers{

    public static void main(String... args){
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int firstInput = userInput.nextInt();
        System.out.print("Enter the second number: ");
        int secondInput = userInput.nextInt();
        System.out.print("Enter the third number: ");
        int thirdInput = userInput.nextInt();
        System.out.print("Enter the fourth number: ");
        int fourthInput = userInput.nextInt();
        System.out.print("Enter the fifth number: ");
        int fifthInput = userInput.nextInt();
        
        
        int largestNumber = 0;
        int smallestNumber = 0;
        int largestOfFirstAndSecondNumber = 0;
        int smallestOfFirstAndSecondNumber = 0;
        int largestOfThirdAndFourthNumber = 0;
        int smallestOfThirdAndFourthNumber = 0;
        
        if(firstInput > secondInput){
            largestOfFirstAndSecondNumber = firstInput;
            smallestOfFirstAndSecondNumber = secondInput;
        }
        
        if(firstInput < secondInput){
            largestOfFirstAndSecondNumber = secondInput;
            smallestOfFirstAndSecondNumber = firstInput;
        }
        
        if(thirdInput > fourthInput){
            largestOfThirdAndFourthNumber = thirdInput;
            smallestOfThirdAndFourthNumber = fourthInput;
        }
        
        if(thirdInput < fourthInput){
            largestOfThirdAndFourthNumber = fourthInput;
            smallestOfThirdAndFourthNumber = thirdInput;
        }
        
         if(largestOfFirstAndSecondNumber > largestOfThirdAndFourthNumber){
            largestNumber = largestOfFirstAndSecondNumber;
            smallestNumber = smallestOfThirdAndFourthNumber;
        }
        
        if(largestOfFirstAndSecondNumber < largestOfThirdAndFourthNumber){
            largestNumber = largestOfThirdAndFourthNumber;
            smallestNumber = smallestOfFirstAndSecondNumber;
        }
        
        
        if(largestNumber < fifthInput){
            largestNumber = fifthInput;
        }
        
        if(smallestNumber > fifthInput){
            smallestNumber = fifthInput;
        }

        System.out.printf("The largest number is %d%n", largestNumber);
        System.out.printf("The smallest number is %d%n", smallestNumber);
        
    }
}
