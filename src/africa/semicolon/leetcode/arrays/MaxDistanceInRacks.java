package africa.semicolon.leetcode.arrays;

import java.util.Arrays;

public class MaxDistanceInRacks {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{10, 0, 8, 2, -1, 12, 11, 3}));
        System.out.println(solution(new int[]{5, 5}));
    }

    public static int solution(int[] arr){
        Arrays.sort(arr);
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if( max < Math.abs(arr[i] - arr[i + 1])){
                max = Math.abs(arr[i] - arr[i + 1]);
            }
        }
        return  (int)(max / 2);
    }
}
