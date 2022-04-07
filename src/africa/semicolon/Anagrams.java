package africa.semicolon;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagrams {
    public static void main(String[] args) {

//        System.out.println(areAnagrams("hello", "elloh"));
//
//
//        System.out.println("hello world hey".split(" ").length);
//        System.out.println(balanceIndex(new int[]{1,2,1,2,1,3}));
//        System.out.println(balanceIndex(new int[]{20, 10}));
        System.out.println(balanceIndex(new int[]{1,2,3,4,6}));
    }

    public static boolean areAnagrams(String a, String b){
        if(a.length() != b.length()) return false;
        char[] arrA = a.toLowerCase().toCharArray();
        char[] arrB = b.toLowerCase().toCharArray();

        Arrays.sort(arrA);
        Arrays.sort(arrB);


        return String.valueOf(arrA).equals(String.valueOf(arrB));



    }

    public static int balanceIndex(int[] arr){

//        int [] arr = list.stream().mapToInt(Integer::intValue).toArray();

        for (int i = 1; i < arr.length - 1; i++) {
            int[] left = new int[i];
            int[] right = new int[arr.length - i];
            System.arraycopy(arr, 0, left, 0, i);
            System.arraycopy(arr, i + 1, right, 0, right.length - 1);

            if(Arrays.stream(left).sum() == Arrays.stream(right).sum()) return i;
        }
        return -1;
//        int middle = arr.length / 2;
//        int[] left = new int[middle];
//        int[] right = new int[middle];
//        System.arraycopy(arr, 0, left, 0, middle);
//        System.arraycopy(arr, middle, right, 0, middle);



//        return -1;
//        return Math.abs(Arrays.stream(left).sum() - Arrays.stream(right).sum());

    }
}
