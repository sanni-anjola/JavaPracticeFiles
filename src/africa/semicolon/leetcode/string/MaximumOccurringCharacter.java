package africa.semicolon.leetcode.string;

import java.util.*;

public class MaximumOccurringCharacter {

    public static String transform(String text){
        String[] strArray = text.split("");
        Arrays.sort(strArray);
        return String.join("", strArray);
    }
    public static List<String> funWithAnagrams(List<String> text){
        Map<String, String> map = new TreeMap<>();

        for (String word : text) {
            String transformed = transform(word);

            if (!map.containsValue(transformed)) {
                map.put(word, transformed);
            }

        }
        return map.keySet().stream().toList();
    }
    public static char maximumOccurringCharacter(String text){
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if(characterIntegerMap.containsKey(letter)){
                characterIntegerMap.put(letter, characterIntegerMap.get(letter) + 1);
            }else {
                characterIntegerMap.put(letter, 1);
            }
        }
        int max = -1;
        char found = '0';
        for (Map.Entry<Character, Integer> e: characterIntegerMap.entrySet()) {
            if(e.getValue() > max){
                max = e.getValue();
                found = e.getKey();
            }
        }

        return found;
    }

    public static void solution(){

    }

    public static void main(String[] args) {
        System.out.println(maximumOccurringCharacter("abbbacc"));
        System.out.println(funWithAnagrams(List.of("code", "doce", "ecod", "framer", "frame")));
    }
}
