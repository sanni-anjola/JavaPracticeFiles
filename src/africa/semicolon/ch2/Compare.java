package africa.semicolon.ch2;

import java.util.Scanner;

public class Compare{
    public static void main(String... args){
        
        int num1;
        int num2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();
        
        if(num1 == num2) System.out.println("These numbers are equal");
        if(num1 > num2) System.out.printf("%d is larger%n", num1);
        if(num1 < num2) System.out.printf("%d is larger%n", num2);
        
    }
}
