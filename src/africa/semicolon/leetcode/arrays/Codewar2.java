package africa.semicolon.leetcode.arrays;

import java.util.Arrays;

public class Codewar2 {
    /*
    String Challenge
Have the function StringChallenge(str) take the str parameter being passed and return it in proper camel case format where the first letter of each word is capitalized (excluding the first letter). The string will only contain letters and some combination of delimiter punctuation characters separating each word.

For example: if str is "BOB loves-coding" then your program should return the string bobLovesCoding.
Examples
Input: "cats AND*Dogs-are Awesome"
Output: catsAndDogsAreAwesome
Input: "a b c d-e-f%g"
Output: aBCDEFG

     */

    public String solution(String text){
        String[] words = text.split("[\\W_]+");

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i == 0) {
                word = word.isEmpty() ? word : word.toLowerCase();
            } else {
                word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            }
            builder.append(word);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Codewar2 codewar2 = new Codewar2();
        System.out.println(codewar2.solution("a b-c-d%g"));

        char[] arr = ("wellccomee"+"d").toCharArray();
        StringBuilder s = new StringBuilder();
        for(int i = 1; i < arr.length;){
            if(arr[i - 1] == arr[i]){
                i+=2;
                continue;
            }
            s.append(arr[i-1]);
            i++;
        }
        System.out.println(s.toString());
    }



}
