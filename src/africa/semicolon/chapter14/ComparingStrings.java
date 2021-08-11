package africa.semicolon.chapter14;

import java.util.Scanner;

public class ComparingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first input: ");
        String firstInput = scanner.nextLine();
        System.out.print("Enter second input: ");
        String secondInput = scanner.nextLine();

        if(firstInput.compareTo(secondInput) < 0){
            System.out.println(firstInput + " is less than " + secondInput);
        }else if (firstInput.compareTo(secondInput) > 0){
            System.out.println(firstInput + " is greater than " + secondInput);

        }else {
            System.out.println(firstInput + " is the same " + secondInput);

        }
    }
}
