package africa.semicolon.chapterFourExercises;

import java.util.Scanner;

public class Factorial {
    public long factorial(long number){
        if(number <= 0){
            return 0;
        }else {
            long product = 1;
            for (long i = number; i >= 2; i--) {
                product *= i;
            }
            return product;
        }
    }

    public double computeE(int numberOfTerms){
        if(numberOfTerms <= 0){
            return 0;
        }
        double e = 0;
        for (int i = numberOfTerms; i > 1; i--) {
            e += 1.0 / factorial(i);
        }
        return e;
    }

    public double computeEx(int numberOfTerms){
        if(numberOfTerms <= 0){
            return 0;
        }
        double e = 0;
        for (int i = numberOfTerms; i > 1; i--) {
            e += Math.pow(numberOfTerms, i)/ factorial(i);
        }
        return e;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for factorial computation: ");
        int userInput = scanner.nextInt();
        System.out.printf("The factorial of %d is %d%n", userInput, factorial.factorial(userInput));

        System.out.print("Enter a number of terms of exponental constant: ");
        userInput = scanner.nextInt();

        System.out.printf("The approximate value of e for %d terms is %f%n", userInput, factorial.computeE(userInput));
        System.out.printf("The approximate value of e^x for %d terms is %f%n", userInput, factorial.computeE(userInput));
    }
}
