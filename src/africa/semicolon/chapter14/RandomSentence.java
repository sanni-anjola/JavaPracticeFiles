package africa.semicolon.chapter14;

import java.security.SecureRandom;

public class RandomSentence {
    public static void main(String[] args) {
        String[] article = {"the", "a", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < 20; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(article[secureRandom.nextInt(5)]).append(" ");
            stringBuilder.append(noun[secureRandom.nextInt(5)]).append(" ");
            stringBuilder.append(verb[secureRandom.nextInt(5)]).append(" ");
            stringBuilder.append(preposition[secureRandom.nextInt(5)]).append(" ");
            stringBuilder.append(article[secureRandom.nextInt(5)]).append(" ");
            stringBuilder.append(noun[secureRandom.nextInt(5)]).append(".");
            System.out.println(stringBuilder.replace(0, 1, String.valueOf(Character.toUpperCase(stringBuilder.charAt(0)))));

        }
    }
}
