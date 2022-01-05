package africa.semicolon.leetcode.string;

public class ReverseString {
    public static String solution(String str) {
        // Reverse a String
        String challengeToken = "yn7is8c";
        String[] n = challengeToken.split("");
        String result = new StringBuilder(str).reverse().toString();
        for (String y : n) {
            result = result.replaceAll("(?i)" + y, "");
        }
        if (result.isEmpty()) return "EMPTY";
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution("I Love Code"));
    }
}
