package africa.semicolon.chapterSevenExercises;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class FisherYatesShufflingAlgo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{1,2,3,4,5,6,7,8})));
    }

    public static int[] shuffle(int[]  intArrays){

        SecureRandom randomInt = new SecureRandom();    // non-deterministic
//        Random randomIn = new Random(0); // deterministic
        final int ARRAY_LENGTH = intArrays.length;
        for (int i = ARRAY_LENGTH - 1;  i > 0 ; i--) {
            int j = randomInt.nextInt(ARRAY_LENGTH - i);
//            int j = randomIn.nextInt(ARRAY_LENGTH - i);
            System.out.println(j);
            int temp = intArrays[i];
            intArrays[i] = intArrays[j];
            intArrays[j] = temp;
        }

        return intArrays;
    }
}
