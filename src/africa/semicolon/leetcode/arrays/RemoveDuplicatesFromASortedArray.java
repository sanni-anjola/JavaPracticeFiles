package africa.semicolon.leetcode.arrays;

public class RemoveDuplicatesFromASortedArray {

    public static int solution(int[] arr) {
        int pointer = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] != arr[i + 1]){
                arr[pointer] = arr[i+1];
                pointer++;
            }
        }
        return pointer;
    }
}
