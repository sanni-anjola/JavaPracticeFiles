package africa.semicolon.interviews;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NextHighest {
    public static void main(String[] args) {
        nextHighest(new int[]{1,2,7,4,5,6,7});
        int[] array = {1,2,7,4,5,6,7};
        int high = Integer.MIN_VALUE;
        int nextHigh = high;

        System.out.print("The given array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-4d", array[i]);
        }
        System.out.println();

        for(int num : array){
            if(num > high){
                nextHigh = high;
                high = num;
            }else if (num > nextHigh && num != high) {
                nextHigh = num;
            }
        }
        System.out.printf("Highest: %d%n", high);
        System.out.printf("Second Highest: %d%n", nextHigh);
    }

//    public static void nextHighest(ArrayList<Integer> array){
    public static void nextHighest(int[] array){

        int high = Integer.MIN_VALUE;
        int nextHigh = high;

        System.out.print("The given array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-4d", array[i]);
        }
        System.out.println();

        for(int num : array){
            if(num > high){
                nextHigh = high;
                high = num;
            }else if (num > nextHigh && num != high) {
                nextHigh = num;
            }
        }
        System.out.printf("Highest: %d%n", high);
        System.out.printf("Second Highest: %d%n", nextHigh);
    }

    public static String reverse(String str){
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end){
            Character c = chars[start];

        }
        return null;
    }
}
