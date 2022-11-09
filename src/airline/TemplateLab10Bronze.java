package airline;

import java.util.*;

/**
 * A simple recursive method to find the largest value in a list,
 * and a main program to test it.
 */
public class TemplateLab10Bronze {
  
  public static void main(String[] args) { 
    double[] test = {2.3,5.6,9.8,6.5,7.2,4.4};
    System.out.println("The largest element of the array "+Arrays.toString(test)+
                       "\n is "+largestInList(test.length,test));
    test = new double[]{1.1};
    System.out.println("The largest element of the array "+Arrays.toString(test)+
                       "\n is "+largestInList(test.length,test));

    System.out.println(Arrays.toString(findSums(new int[]{3, 5, -2}, 3)));
  }//main
  
  //******Add your method here******
  public static double largestInList(int n, double[] list){
    if(n > 1)
      return Math.max(list[n - 1], largestInList(n - 2, list));
    else
      return list[0];
  }

  public static int[] bestCombos(int[] combos, int k){
    PriorityQueue<Integer> pQueue_heap =
            new PriorityQueue<Integer>(Collections.reverseOrder());
    for (int i = 0; i < combos.length; i++) {


    }
    return null;
  }


  private static long[] findSums(int[] combos, int k) {
    long maxSum = Arrays.stream(combos).filter(it -> it >= 0).sum();

    int[] positives = Arrays.stream(combos).filter(it -> it >= 0).sorted().toArray();
    int[] negatives = Arrays.stream(combos).filter(it -> it < 0).sorted().toArray();
    // sort time complexity is O(n*log(n))

    PriorityQueue<Long> sums = new PriorityQueue<>(k); // priority queue is implemented using heap so adding element has time complexity O(log(n))
    sums.add(maxSum); // we start with max sum - combination of all positive elements

    int previous = Integer.MIN_VALUE;
    Long[] previousAddedSums = {};
    Long[] sumsToIterate;

    // iterate over positive values
    for (int i = 0; i < positives.length; i++) {
      if (positives[i] == previous) {
        sumsToIterate = previousAddedSums;
      } else {
        sumsToIterate = sums.toArray(new Long[sums.size()]);
      }
      previousAddedSums = new Long[sumsToIterate.length];
      for (int j = 0; j < sumsToIterate.length; j++) {
        long newSum = sumsToIterate[j] - positives[i];
        // new sum is calculated - value positives[i] is removed from combination (subtracted from sum of that combination)
        sums.add(newSum);
        previousAddedSums[j] = newSum;
        if (sums.size() > k) {
          sums.poll(); // only first k maximum sums are needed at the moment
        }
      }
      previous = positives[i];
    }

    previous = Integer.MAX_VALUE;
    // iterate over negative values in reverse order
    for (int i = negatives.length - 1; i >= 0; i--) {
      if (negatives[i] == previous) {
        sumsToIterate = previousAddedSums;
      } else {
        sumsToIterate = sums.toArray(new Long[sums.size()]);
      }
      previousAddedSums = new Long[sumsToIterate.length];
      for (int j = 0; j < sumsToIterate.length; j++) {
        long newSum = sumsToIterate[j] + negatives[i]; // value negatives[i] is added to combination (added to sum of that combination)
        sums.add(newSum);
        previousAddedSums[j] = newSum;
        if (sums.size() > k) {
          sums.poll();
        }
      }
      previous = negatives[i];
    }

    long[] result = new long[sums.size()];
    for (int i = sums.size() - 1; i >= 0; i--) {
      result[i] = sums.poll();
    }

    return result;
  }

  private int[][] getDeliveries(int[][] deliveries, int numDeliveries) {

    PriorityQueue<int[]> deliveryQueue = new PriorityQueue<>((arr1, arr2) -> {
      int value1 = arr1[0] * arr1[0] + arr1[1] * arr1[1];
      int value2 = arr2[0] * arr2[0] + arr2[1] * arr2[1];
      return (int) (Math.sqrt(value2) - (Math.sqrt(value1)));
    });

    for (int[] delivery : deliveries) {
      deliveryQueue.offer(delivery);
      if (deliveryQueue.size() > numDeliveries) {
        deliveryQueue.poll();
      }
    }
    int[][] ans = new int[numDeliveries][2];
    int idx = numDeliveries - 1;
    while (idx >= 0) {
      ans[idx--] = deliveryQueue.poll();
    }
    return ans;
  }

  private List<List<Integer>> deliveryPlan(List<List<Integer>> allocations, int numDeliveries) {

    PriorityQueue<List<Integer>> deliveryQueue = new PriorityQueue<>((arr1, arr2) -> {
      int value1 = arr1.get(0) * arr1.get(0) + arr1.get(1) * arr1.get(1);
      int value2 = arr2.get(0) * arr2.get(0) + arr2.get(1) * arr2.get(1);
      return (int) (Math.sqrt(value2) - (Math.sqrt(value1)));
    });

    for (List<Integer> delivery : allocations) {
      deliveryQueue.offer(delivery);
      if (deliveryQueue.size() > numDeliveries) {
        deliveryQueue.poll();
      }
    }
    List<List<Integer>> ans = new ArrayList<>(new ArrayList<>());
    int idx = numDeliveries - 1;
    while (idx >= 0) {
      ans.add(idx--, deliveryQueue.poll());
    }
    return ans;
  }
}
