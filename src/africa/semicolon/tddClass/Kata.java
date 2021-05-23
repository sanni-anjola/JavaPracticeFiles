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
//            System.out.println("This number is not a palindrome");
            return false;
        }
//        System.out.println("This number is a palindrome");
        return true;
    }


    public char whatGradeIs(int score) {

        if(score >= 90){
            return 'A';
        }else if(score >= 80){
            return 'B';
        }else if(score >= 70){
            return 'C';
        }else if(score >= 60){
            return 'D';
        }else {
            return 'F';
        }
    }
//    TestDriller
    public int totalAmountForTestDriller(int copies){
        int amountPerDrill = 0;
        if(copies > 0) {
            if (copies >= 200) {
                amountPerDrill = 800;
            } else if (copies >= 100) {
                amountPerDrill = 900;
            } else if (copies >= 50) {
                amountPerDrill = 1000;
            } else if (copies >= 30) {
                amountPerDrill = 1100;
            } else if (copies >= 10) {
                amountPerDrill = 1200;
            } else if (copies >= 5) {
                amountPerDrill = 1400;
            } else {
                amountPerDrill = 1500;
            }
        }
        return copies * amountPerDrill;

    }

    public int resellersProfit(int copies){
        final int AMOUNT_PER_DRILL = 2000;
        int profit = 0;
        if(copies > 0) {
            int sellingPrice = copies * AMOUNT_PER_DRILL;
            profit = sellingPrice - totalAmountForTestDriller(copies);
        }
        return profit;
    }
}
