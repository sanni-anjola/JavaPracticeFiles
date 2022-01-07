package africa.semicolon.leetcode.arrays;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

import static java.time.temporal.ChronoUnit.MINUTES;

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

    public static int[] firstAndLastIndex(int[] arr, int key){
        String strOfInts = Arrays.toString(arr).replaceAll("\\[|\\]|,|\\s", "");
        return new int[]{strOfInts.indexOf(String.valueOf(key)), strOfInts.lastIndexOf(String.valueOf(key))};
    }
    static class Interval{
        private LocalDateTime start;
        private LocalDateTime end;

        public Interval(LocalDateTime start, LocalDateTime end) {
            this.start = start;
            this.end = end;
        }

        public LocalDateTime getStart() {
            return start;
        }

        public void setStart(LocalDateTime start) {
            this.start = start;
        }

        public LocalDateTime getEnd() {
            return end;
        }

        public void setEnd(LocalDateTime end) {
            this.end = end;
        }
    }
    public static Interval[] mergeIntervals(Interval[] arr)
    {
        // Test if the given set has at least one interval
        if (arr.length <= 0)
            return null;

        // Create an empty stack of intervals
        Stack<Interval> stack=new Stack<>();

        Arrays.sort(arr,new Comparator<Interval>(){
            public int compare(Interval i1,Interval i2)
            {
                return (int) MINUTES.between(i1.getStart(), i2.getStart());
            }
        });

        stack.push(arr[0]);

        for (int i = 1 ; i < arr.length; i++)
        {

            Interval top = stack.peek();

            if (top.getEnd().isBefore(arr[i].getStart()))
                stack.push(arr[i]);


            else if (top.getEnd().isBefore(arr[i].getEnd()))
            {
                top.end = arr[i].end;
                stack.pop();
                stack.push(top);
            }
        }


        System.out.print("The Merged Intervals are: ");
        Interval[] result = new Interval[stack.size()];


        for (int i = 0; i < result.length; i++) {
            result[i] = stack.pop();
        }

        return result;
    }
    public static String loveProblem(String s){
        return null;
    }


}
