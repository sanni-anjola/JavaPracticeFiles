package africa.semicolon.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] solution(int[] arr, int target){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    public static int[] solutionMap(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int remainder = target - arr[i];
            if (map.containsKey(remainder)){
                return new int[]{map.get(remainder), i};
            }else {
                map.put(arr[i], i);
            }
        }

        return null;
    }

    public static String loveProblem(String s){
        return null;
    }


}
