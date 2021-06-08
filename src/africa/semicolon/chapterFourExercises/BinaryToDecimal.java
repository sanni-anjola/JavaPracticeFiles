package africa.semicolon.chapterFourExercises;

public class BinaryToDecimal {
    public static int binaryToDecimal(int binaryNumber, int base){
        int digit;
        int result = 0;
        String binaryString = ""+binaryNumber;
        for (int i = 0; i < binaryString.length(); i++) {
            digit = binaryString.charAt(i) - 48;
            result = result * base + digit;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(binaryToDecimal(111011, 2)); // 59
        System.out.println(binaryToDecimal(111, 2));   // 7
    }
}
