package africa.semicolon.chapter14;

public class ThreeLetterWordsFromFiveLetterWord {
    public static void main(String[] args) {
        String fiveLetterWord = "bathe";

        for (int i = 0; i < fiveLetterWord.length() - 2; i++) {
            for (int j = i; j < fiveLetterWord.length() - 1; j++) {
                for (int k = j; k < fiveLetterWord.length(); k++) {
                    if(i != j && j != k)
                        System.out.println("" + fiveLetterWord.charAt(i) + fiveLetterWord.charAt(j) + fiveLetterWord.charAt(k));
                }
            }

        }
    }



}
