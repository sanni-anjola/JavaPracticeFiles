package africa.semicolon.chapter14;

import java.util.HashMap;
import java.util.Map;

public class TextAnalysis {

    public static void main(String[] args) {
//        countLetters("To be, or not to be: that is the question");
//        wordCount("Whether 'tis nobler in the mind to suffer");
        countWords("To be, or not to be: that is the question: " +
                "Whether 'tis nobler in the mind to suffer");
    }
    public static void countLetters(String sentence){
        String[] alphabets = "abcdefghijklmnopqrstuvwxyz".split("");
        System.out.printf("%6s | %-6s%n", "letter", "count");
        for (String letter : alphabets){
            if(!letter.equals(" ")){
                int count = SearchingString1.characterCount(sentence, letter.charAt(0));
                System.out.printf("%-6s | %-6d%n", letter, count);
            }
        }
    }

    public static void wordCount(String sentence){
        Map<Integer, Integer> wordLengthStorage = new HashMap<>();
        String[] words = sentence.split(" ");

        for (String word : words){
            int length = word.length();
            if(wordLengthStorage.containsKey(length)){
                wordLengthStorage.put(length, wordLengthStorage.get(length) + 1);
            }else {
                wordLengthStorage.put(length, 1);
            }
        }

        System.out.printf("%6s | %-6s%n", "length", "count");

        for (Integer length : wordLengthStorage.keySet()){
            System.out.printf("%-6d | %-6d%n", length, wordLengthStorage.get(length));
        }
    }

    public static void countWords(String sentence){
        String[] words = sentence.split(" ");
        System.out.printf("%-10s | %-6s%n", "word", "count");
        for (String word : words){
                int count = SearchingString1.wordCount(sentence, word);
                System.out.printf("%-10s | %-6d%n", word, count);
        }
    }
}
