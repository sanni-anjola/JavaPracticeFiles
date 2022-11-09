package airline;

public class FindMax {
    public static int findMax(int[] arr, int index){
        if(index > 0)
            return Math.max(arr[index], findMax(arr, index - 1));
        else
            return arr[0];
    }

    public static void main(String[] args) {
        System.out.println(findMax(new int[]{2, 3, 1, -1, 8}, 3));
    }
}
