package africa.semicolon.c10Loops;

public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            for (int j = 2; j <= 12; j++) {
                System.out.printf("%d x %d = %d ", j, i,  i * j);

            }
            System.out.println();
        }
    }
}
