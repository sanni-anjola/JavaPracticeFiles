package africa.semicolon.leetcode.string;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class SingUPPassword {

    public static void main(String[] args) {

//        System.out.println(minimalOperations(List.of("abbaaab", "ab")));

        System.out.println(fetchItemsToDisplay(List.of(List.of("p1", "1", "2"), List.of("p2", "2", "1"), List.of("p3", "3", "4")), 0, 0, 2));
    }
    public static List<Integer> minimalOperations(List<String> words) {
        List<Integer> result = new ArrayList<>();
        for (String word : words) {
            int n = word.length();

            int i = 0;

            while (i < n) {
                int j = i;
                while (j < n && word.charAt(j) ==
                        word.charAt(i)) {
                    j++;
                }
                int diff = j - i;

                result.add(diff / 2);
                i = j;

            }

        }
        return result;
    }

    public static List<String> fetchItemsToDisplay(List<List<String>> items, int sortParameter, int sortOrder, int X) {

        return items.stream().reduce((a, b) -> {
            if (sortParameter == 0 && sortOrder == 0) {
                if (a.get(0).compareTo(b.get(0)) < 0){
                    return a;
                }
            } else if (sortParameter == 0 && sortOrder == 1) {
                if (a.get(0).compareTo(b.get(0)) > 0){
                    return b;
                }

            } else if (sortOrder == 0) {
                if (Integer.parseInt(a.get(sortParameter)) > Integer.parseInt(b.get(sortParameter))) {
                    return b;
                }
            }

            return b;
        }).stream().limit(X).map(item -> item.get(0)).collect(Collectors.toList());

    }

    public static BigInteger findFactorial(int num){

        BigInteger[] results = new BigInteger[100];
        results[0] = BigInteger.valueOf(1);
        int resSize = 0;

        for (int x = 2; x <= num; x++) {
            results[resSize + 1] = results[resSize].multiply(BigInteger.valueOf(x));
            resSize += 1;
        }
//        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE
//
//        // Multiply f with 2, 3, ...N
//        for (int i = 2; i <= num; i++)
//            f = f.multiply(BigInteger.valueOf(i));
//
//        return f;

        return results[resSize];
    }

}
