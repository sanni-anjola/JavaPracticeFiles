package africa.semicolon.leetcode.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

// LongestString.java
import java.util.*;

public class LongestString {
    public static void main(String[] args) {
        System.out.println(longest("I love Java"));
    }
    public static String longest(String strings){
        return Arrays
                .stream(strings.split(" "))
                .reduce("", (acc, word) -> acc.length() < word.length() ? word: acc);
    }
}
