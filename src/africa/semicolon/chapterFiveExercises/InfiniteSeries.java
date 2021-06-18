package africa.semicolon.chapterFiveExercises;

public class InfiniteSeries {
    public static void main(String[] args) {
//        double series = 0;
//        for (int i = 0, j = 1; i < 200000; i++, j+=2) {
//
//
//        }

        int[] numbers = {1,2,3,4,5};
        int sum = 0;
        for(int number : numbers) sum += number;
        System.out.println(sum);
    }
}
