package africa.semicolon.leetcode.arrays;

public class ArrayAnalyzer {


    public static void main(String[] args) {
        System.out.println(analyze(new int[]{3, 5, 4, 752}));
    }

    public static int analyze(int[] arr){
        double maxValue = Double.MIN_VALUE;
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            double power = Math.pow(arr[i - 1], arr[i]);
            if(power > maxValue) {
                maxValue = power;
                System.out.println("Max " + maxValue);
                index = i;
            }
        }
        return arr[arr.length - 1] > maxValue ? arr.length : index;
    }
}
