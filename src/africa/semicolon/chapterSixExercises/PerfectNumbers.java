package africa.semicolon.chapterSixExercises;

public class PerfectNumbers {
    public static boolean isPerfect(int number){
        return number == computeSumOfFactors(number);
    }

    public static String getFactors(int number){
        int factor = 1;
        StringBuilder factors = new StringBuilder();
        int upperLimit = number / 2;
        while (factor <= upperLimit) {
            if (number % factor == 0) {
                factors.append(factor).append(" ");
            }
            factor++;
        }
        return factors.toString();
    }
    public static int computeSumOfFactors(int number) {
        int factor = 1;
        int sumOfFactors = 0;
        int upperLimit = number / 2;
        while (factor <= upperLimit) {
            if (number % factor == 0) {
                sumOfFactors += factor;
            }
            factor++;
        }
        return sumOfFactors;
    }

    public static void main(String[] args) {
        System.out.printf("%7s | %7s%n", "Number", "Factors");
        System.out.println("_".repeat(35));
        for (int i = 1; i <= 1000; i++) {
            if(isPerfect(i))
                System.out.printf("%-7d | %-7s%n", i, getFactors(i));

        }
    }
}
