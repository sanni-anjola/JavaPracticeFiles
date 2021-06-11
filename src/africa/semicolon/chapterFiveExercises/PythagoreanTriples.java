package africa.semicolon.chapterFiveExercises;

public class PythagoreanTriples {
    public static void main(String[] args) {
        System.out.printf("%-7s | %-7s | %-10s%n", "Side A", "Side B", "Hypotenuse");
        System.out.println("-------------------------------");
        for (int i = 1; i <= 500; i++) {
            for (int j = 1; j <= 500 ; j++) {
                for (int k = 1; k <= 500 ; k++) {

                    if(i * i == j * j + k * k) {

                        System.out.printf("%-7d | %-7d | %-10d%n", k, j, i);
                    }
                }
            }
        }
    }
}
