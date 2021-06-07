package africa.semicolon.chapterFourExercises;

public class TabularOutput {

    public static void main(String[] args) {
        System.out.printf("%-7s%-10s%-10s%-10s%n","N", "10*N", "100*N", "1000*N");
        int n = 1;
        while(n <= 5){
            System.out.printf("%-7d%-10d%-10d%-10d%n", n, 10 * n, 100 * n, 1000 * n);
            n++;
        }
    }
}
