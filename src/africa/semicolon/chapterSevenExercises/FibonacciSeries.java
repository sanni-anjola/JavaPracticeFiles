package africa.semicolon.chapterSevenExercises;

import java.util.Arrays;
import java.util.HashMap;

public class FibonacciSeries {

    public static int fibonacciMap(int nthTerm){
        var closure = new HashMap<Integer, Integer>();
        closure.put(0,0);
        closure.put(1,1);
        if(closure.containsKey(nthTerm)) return closure.get(nthTerm);
        closure.put(nthTerm, fibonacciMap(nthTerm - 1) + fibonacciMap(nthTerm - 2));
        return closure.get(nthTerm);
    }

    public static int fibonacciArray(int nthTerm){
        var closure = new int[nthTerm + 2];
        closure[0] = 0;
        closure[1] = 1;
        if(nthTerm <= 1) return closure[nthTerm];
        closure[nthTerm] = fibonacciArray(nthTerm - 1) + fibonacciArray(nthTerm - 2);
        return closure[nthTerm];
    }


    public static void swapSpotInArray(int[] numbers){
        int temp = numbers[1];
        numbers[1] = numbers[2];
        numbers[2] = temp;
    }

    public static void swapArray(int[] numbers1, int[] numbers2){
        int[] temp = numbers1;
        numbers1 = numbers2;
        numbers2 = temp;
        System.out.println("first" + Arrays.toString(numbers1));
        System.out.println("second" + Arrays.toString(numbers2));
    }

    public static int add(int... nums){
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(fibonacciMap(9));
        System.out.println(fibonacciArray(9));

        var nums = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        swapSpotInArray(nums);
        System.out.println(Arrays.toString(nums));

        var nums1 = new int[]{1,2,3,4,5};
        var nums2 = new int[]{10,20,30,40,50};
        var nums3 = new int[][]{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
//        var nums4 = new int[][]{{16,26,36,46,56}, {6,7,8,9,10}, {11,12,13,14,15}};
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        swapArray(nums1, nums2);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        System.out.println(Arrays.deepToString(nums3));
        swapArray(nums3[0], nums3[1]);
        System.out.println(Arrays.deepToString(nums3));

        System.out.println(add(1,2,3,4));
//        System.out.println(add(new int[]{1,2,3,4,5,6}));

//        String[] array = {"a", "b", "c", "d", "e"};
//
//        //Method 1
//        List<String> list = Arrays.asList(array);
//        System.out.println(list);
//
//        //Method 2
//        List<String> list1 = new ArrayList<String>();
//        Collections.addAll(list1, array);
//        System.out.println(list1);
//
//        //Method 3
//        List<String> list2 = new ArrayList<String>();
//        for(String text:array) {
//            list2.add(text);
//        }
//        System.out.println(list2);

    }

}
