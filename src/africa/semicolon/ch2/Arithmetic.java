package africa.semicolon.ch2;

import java.util.Scanner;

public class Arithmetic{
    public static void main(String... args){
        
        int num1;
        int num2;
        int sum;
        int product;
        int difference;
        int quotient;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("The program request for two numbers and output result based on the input");
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();
        
        sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;
        quotient = num1 / num2;
        
        System.out.printf("Sum: %d + %d = %d%n", num1, num2, sum);
        System.out.printf("Difference: %d - %d = %d%n", num1, num2, difference);
        System.out.printf("Product: %d * %d = %d%n", num1, num2, product);
        System.out.printf("Quotient: %d / %d = %d%n", num1, num2, quotient);
    }
}
