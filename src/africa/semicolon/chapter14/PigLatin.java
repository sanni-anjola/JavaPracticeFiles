package africa.semicolon.chapter14;

import java.util.Arrays;
import java.util.Scanner;

public class PigLatin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        StringBuilder builder = new StringBuilder();
        for(String word : words){
            builder.append(printLatin(word)).append(" ");
        }
        System.out.println(builder.toString().stripLeading());
    }

    public static String printLatin(String word){
        return word.substring(1) + word.charAt(0) + "ay";
    }
}
