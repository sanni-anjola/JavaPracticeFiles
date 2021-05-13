package africa.semicolon.tddClass;

public class Kata {
    public boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int num = Math.abs(number);
        int numberOfDigits = (int)Math.log10(num) + 1;
        for(int i = 1; i <= numberOfDigits; i++){
            reversedNumber += ((num % 10) * (int)Math.pow(10, numberOfDigits - i));
            num = num / 10;
        }
        if(Math.abs(number)  != reversedNumber){
            System.out.println("This number is not a palindrome");
            return false;
        }
        System.out.println("This number is a palindrome");
        return true;
    }
}
