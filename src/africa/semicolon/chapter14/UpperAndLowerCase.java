package africa.semicolon.chapter14;

import java.util.Scanner;

public class UpperAndLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());
    }
}
