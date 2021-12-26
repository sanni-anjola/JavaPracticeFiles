package africa.semicolon;

import java.util.Arrays;
import java.util.Collections;

public class Anagrams {
    public static void main(String[] args) {

        System.out.println(areAnagrams("hello", "elloh"));


        System.out.println("hello world hey".split(" ").length);
    }

    public static boolean areAnagrams(String a, String b){
        if(a.length() != b.length()) return false;
        char[] arrA = a.toLowerCase().toCharArray();
        char[] arrB = b.toLowerCase().toCharArray();

        Arrays.sort(arrA);
        Arrays.sort(arrB);


        return String.valueOf(arrA).equals(String.valueOf(arrB));



    }
}
