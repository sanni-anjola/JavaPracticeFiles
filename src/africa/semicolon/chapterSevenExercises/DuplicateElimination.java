package africa.semicolon.chapterSevenExercises;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {

    public static boolean checkDuplicate(int[] nums, int checkNumber){
        for(int num : nums){
            if(num == checkNumber) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE };
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int temp_int = 0;
        String temp;
        while (counter < 5){
            System.out.printf("Enter Number %d: \n", counter+1);

            try {
               temp = scanner.nextLine();
               temp_int = Integer.parseInt(temp);
            }catch (NumberFormatException e){
                System.out.println("Only whole number is allowed");
            }

            if(!checkDuplicate(arr, temp_int)){
                arr[counter] = temp_int;
                counter++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
