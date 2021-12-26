package africa.semicolon.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class TargetDiff {

    static Integer targetDiff(Integer[] arr, Integer target){
//        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(Math.abs(i - j) == target){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(targetDiff(new Integer[]{1,2,3,4}, 1));
    }

}
