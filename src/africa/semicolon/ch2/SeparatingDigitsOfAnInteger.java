package africa.semicolon.ch2;

import java.util.Scanner;

public class SeparatingDigitsOfAnInteger{
    public static void main(String... args){
        
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter an 5-digit Integer: ");
        int digit = input.nextInt();
        
        System.out.printf("%d\t%d\t%d\t%d\t%d%n", (digit/10000)%10, (digit/1000)%10, (digit/100)%10, (digit/10)%10, digit%10);
    }
}
