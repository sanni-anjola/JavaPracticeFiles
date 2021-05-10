import java.util.Scanner;

public class ArithmeticSmallestAndLargest{

    public static void main(String... args){
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter the first number");
        int firstInput = userInput.nextInt();
        System.out.print("Enter the second number");
        int secondInput = userInput.nextInt();
        System.out.print("Enter the third number");
        int thirdInput = userInput.nextInt();
        
        int sum = firstInput + secondInput + thirdInput;
        int average = sum / 3;
        int product = firstInput * secondInput * thirdInput;
        
        int largestNumber = 0;
        int smallestNumber = 0;
        
        if(firstInput > secondInput){
            largestNumber = firstInput;
            smallestNumber = secondInput;
        }
        
        if(firstInput < secondInput){
            largestNumber = secondInput;
            smallestNumber = firstInput;
        }
        
        if(largestNumber < thirdInput){
            largestNumber = thirdInput;
        }
        
        if(smallestNumber > thirdInput){
            smallestNumber = thirdInput;
        }
        
        System.out.printf("The sum is %d%n", sum);
        System.out.printf("The average is %d%n", average);
        System.out.printf("The product is %d%n", product);
        System.out.printf("The largest number is %d%n", largestNumber);
        System.out.printf("The smallest number is %d%n", smallestNumber);
        
    }
}
