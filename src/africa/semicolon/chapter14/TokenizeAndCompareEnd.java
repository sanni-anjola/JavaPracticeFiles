package africa.semicolon.chapter14;

import java.util.Scanner;

public class TokenizeAndCompareEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        for (String word : words){
            if(word.toLowerCase().endsWith("ed")){
                System.out.println(word);
            }
        }
    }
}
