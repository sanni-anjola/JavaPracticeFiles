package africa.semicolon.chapter14;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SearchStrings {
    public static void main(String[] args) {
        System.out.printf("%6s | %-6s%n", "letter", "count");
        System.out.println("-".repeat(14));

        String sentence = "I love programming";
        sentence = sentence.replace("\\s", "");

//        char[] letters = sentence.toLowerCase().toCharArray();
        String[] letters = sentence.toLowerCase().split("");
        Set<String> letterSet = new HashSet<>(Arrays.asList(letters));
//        System.out.println(letterSet);

        for (String letter : letterSet){
            if(!letter.equals(" ")){
                int count = SearchingString1.characterCount(sentence, letter.charAt(0));
                System.out.printf("%-6s | %-6d%n", letter, count);
            }
        }

    }
}
