package africa.semicolon.leetcode.string;

public class SwapFirstAndLastCharacters {
    static String swap(String s){
        if(s.length() < 2){
            return "Incompatible";
        }
        if(s.charAt(0) == (s.charAt(s.length() - 1))){
            return "Two's a pair";
        }

        return new StringBuilder()
                .append(s.charAt(s.length() - 1))
                .append(s.substring(1, s.length() - 1))
                .append(s.charAt(0))
                .toString();
    }

    public static void main(String[] args) {
        System.out.println(swap("anjola"));
        System.out.println(swap("foo"));
        System.out.println(swap("d"));
    }
}
