package africa.semicolon.chapterSevenExercises.miscellaneous;

public class BinarySort {

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j;

            for(j = i - 1; j >= 0 && arr[j] > key; j--){
                arr[j + 1] = arr[j];
            }
            // Insert the current element into list[k + 1]
            arr[j + 1] = key;
        }
    }
}
