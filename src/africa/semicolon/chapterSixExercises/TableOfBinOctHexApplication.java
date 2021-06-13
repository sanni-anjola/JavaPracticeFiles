package africa.semicolon.chapterSixExercises;

public class TableOfBinOctHexApplication {
    public static void main(String[] args) {
        System.out.printf("%7s | %10s | %10s | %10s%n", "Number", "Binary", "Octal", "Hexadecimal");
        System.out.printf("%s%n", "-".repeat(48));

        String baseTwo;
        String baseEight;
        String baseSixteen;
        for (int i = 1; i <= 256; i++) {
            baseTwo = TableOfBinOctAndHex.decToAnyBase(i, 2);
            baseEight = TableOfBinOctAndHex.decToAnyBase(i, 8);
            baseSixteen = TableOfBinOctAndHex.decToAnyBase(i, 16);
            System.out.printf("%7d | %10s | %10s | %10s%n", i, baseTwo, baseEight, baseSixteen);

        }

    }
}
