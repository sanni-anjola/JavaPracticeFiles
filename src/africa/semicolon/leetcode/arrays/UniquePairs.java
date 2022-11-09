package africa.semicolon.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class UniquePairs {

    public int uniquePairs(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = arr.length;
        int count = 0;

        if(len == 0 || k < 0) return 0;

        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j + 1));
            } else {
                map.put(j, 1);
            }
        }

        for (Map.Entry item: map.entrySet()){
            int key = (int) item.getKey();
            int value = (int) item.getValue();

            int find = key + k;

            if( k == 0 && value > 1) {
                count++;
            }
            else if (k != 0 && map.containsKey(find)) {
                count++;
            }

        }
        return count;
    }
}
