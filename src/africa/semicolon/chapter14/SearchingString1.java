package africa.semicolon.chapter14;

import java.util.Locale;
import java.util.Scanner;

public class SearchingString1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("What letter will you like to search? ");
        char letter = scanner.next().charAt(0);

        int count = characterCount(sentence, letter);
        System.out.printf("There are %d occurrences of \"%c\" in the sentence \n", count, letter);

    }

    public static int characterCount(String sentence, char letter){
        int index = 0;
        int count = 0;
        sentence = sentence.toLowerCase();
        letter = Character.toLowerCase(letter);
        while (index < sentence.length()){
            if(sentence.indexOf(letter, index) != -1) {
                index = sentence.indexOf(letter, index) + 1;
                count++;
            }else {
                break;
            }

        }
        return count;
    }

    public static int wordCount(String sentence, String word){
        int index = 0;
        int count = 0;
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        while (index < sentence.length()){
            if(sentence.indexOf(word, index) != -1) {
                index = sentence.indexOf(word, index) + 1;
                count++;
            }else {
                break;
            }

        }
        return count;
    }
}
