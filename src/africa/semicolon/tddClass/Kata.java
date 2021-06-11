package africa.semicolon.tddClass;

public class Kata {
    public boolean isPalindrome(int number) {
        number = Math.abs(number);

        return number == getReversedNumber(number);
    }

    private int getReversedNumber(int number) {
        int reversedNumber = 0;
        int numberOfDigits = (int)Math.log10(number) + 1;
        for(int i = 1; i <= numberOfDigits; i++){
            reversedNumber += ((number % 10) * (int)Math.pow(10, numberOfDigits - i));
            number = number / 10;
        }
        return reversedNumber;
    }




    public char getGrade(int score) {

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
    public int getTotalAmountForTestDriller(int copies){
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

    public int getProfit(int copies){
        final int AMOUNT_PER_DRILL = 2000;
        int profit = 0;
        if(copies > 0) {
            int sellingPrice = copies * AMOUNT_PER_DRILL;
            profit = sellingPrice - getTotalAmountForTestDriller(copies);
        }
        return profit;
    }

    public int computeNumberOfFactors(int number) {
        int lowerLimit = 1;
        int numberOfFactors = 0;
        int upperLimit = number / 2;
        while (lowerLimit <= upperLimit) {
            if (number % lowerLimit == 0) {
                numberOfFactors++;
            }
            lowerLimit++;
        }
        numberOfFactors = number <= 0 ? 0 : numberOfFactors + 1;
        return numberOfFactors;
    }

    public String reverseNumber(int number) {
       String numberString = String.format("%d", number);
       StringBuilder reversedNumber = new StringBuilder();
       for (int i = numberString.length() - 1; i >= 0; i--){
           reversedNumber.append(numberString.charAt(i));
       }
       return reversedNumber.toString();

    }

    public int findFactorialOf(int number) {
        int factorial = 1;

        for(int i = number; i > 1; i--){
            factorial *= i;
        }
        return factorial;
    }

    public String decimalToAnyBase(int decimalNumber, int base) {
        StringBuilder result = new StringBuilder();
        while (decimalNumber != 0){
            result.insert(0, (decimalNumber % base));
            decimalNumber /= base;
        }
        return result.toString();
    }
}
