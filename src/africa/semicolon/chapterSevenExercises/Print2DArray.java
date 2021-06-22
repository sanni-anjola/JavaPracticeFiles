package africa.semicolon.chapterSevenExercises;

public class Print2DArray {
    public static void main(String[] args) {
        int[][] multiIntArrays = {{2, 3, 5}, {0, 5, 9}, {1, 2, 1}};

        for(int[] intArrays : multiIntArrays){
            for(int number : intArrays){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
