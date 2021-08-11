package africa.semicolon.chapter14;

import java.util.Scanner;

public class SentenceWithWordsReversed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");

        for(String word : words){
            StringBuilder builder = new StringBuilder(word);
            builder.reverse().append(" ");
            System.out.print(builder);
        }
    }
}
