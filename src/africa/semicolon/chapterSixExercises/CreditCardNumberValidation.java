package africa.semicolon.chapterSixExercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CreditCardNumberValidation {


    public static int getSize(long creditCardNumber) {
        return (int)Math.log10(creditCardNumber) + 1;
    }

    public static int getDigit(int number) {
        int doubleNumber = number * 2;
        if(doubleNumber >= 10){
            doubleNumber = 1 + (doubleNumber % 10);
        }
        return doubleNumber;
    }

    public static int getPrefix(long number, int k) {
        return (int)(number / Math.pow(10, getSize(number) - k));
    }

    public static boolean prefixMatched(long number) {
        int[] validPrefixes = {4, 5, 37, 6};
        for(int prefix : validPrefixes){
            if (prefix == getPrefix(number, 1) || prefix == getPrefix(number, 2)){
                return true;
            }
        }
        return false;
    }

    public static int getSumOfDoubleOddPlacedDigits(long number){
        int sumOfOddPlacedDigits = 0;
        long divisor = (long)Math.pow(10, getSize(number) - 1);
        int num;
        while (number != 0 && divisor != 0){
            num = (int)(number/divisor);
            sumOfOddPlacedDigits += getDigit(num % 10);
            number %= divisor;
            divisor /= 100;
        }

        return sumOfOddPlacedDigits;
    }

    public static int getSumOfEvenPlacedDigits(long number){
        int sumOfEvenPacedDigits = 0;
        long divisor = (long)Math.pow(10, getSize(number) - 2);
        int num;
        while (number != 0 && divisor != 0){
            num = (int)(number/divisor);
            sumOfEvenPacedDigits += (num % 10);
            number %= divisor;
            divisor /= 100;
        }

        return sumOfEvenPacedDigits;
    }

    public static boolean isValid(long number){
        if(getSize(number) >= 13 && getSize(number) <= 16 && prefixMatched(number)){
           int sum = getSumOfEvenPlacedDigits(number) + getSumOfDoubleOddPlacedDigits(number);
            return sum % 10 == 0;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a credit card number: ");
        try {
            long creditCardNumber = scanner.nextLong();
            if(isValid(creditCardNumber)){
                System.out.println(creditCardNumber + " is valid");
            }else {
                System.out.println(creditCardNumber + " is invalid");
            }
        }catch (InputMismatchException ex){
            System.err.println("Not a Whole Number");
        }

    }
}
