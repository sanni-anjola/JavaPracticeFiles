package africa.semicolon.chapter14;

import java.util.Scanner;

public class ComparingPortionsOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first input: ");
        String firstInput = scanner.nextLine();
        System.out.print("Enter second input: ");
        String secondInput = scanner.nextLine();

        System.out.print("how many characters do you wish to compare: ");
        int length = scanner.nextInt();

        System.out.print("What index should the search start from : ");
        int startIndex = scanner.nextInt();

        boolean isEqual = firstInput.regionMatches(true, startIndex, secondInput, startIndex, length);
        if(isEqual) System.out.println("The Strings are equal");
        else System.out.println("The Strings are not equal");

    }
}
