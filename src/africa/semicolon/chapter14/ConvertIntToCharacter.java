package africa.semicolon.chapter14;


public class ConvertIntToCharacter {
    public static void main(String[] args) {
        System.out.printf("%3s | %3s%n", "code", "Character");
        for (int i = 0; i <= 255; i++) {
            System.out.printf("%03d | %3c%n", i, getChar(i));
        }


    }

    public static char getChar(int value){
        return (char) value;
    }
}
