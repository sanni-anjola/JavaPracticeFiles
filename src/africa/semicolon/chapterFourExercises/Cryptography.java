package africa.semicolon.chapterFourExercises;

public class Cryptography {

    public String encrypt(int number, int shift){
        final int SHIFT = shift;
        int numberLength = 4;
        int remainder = number;
        int digit;
        int encrypt = 0;

        while (numberLength > 0){
            digit = remainder % 10;
            remainder = remainder / 10;

            if(numberLength%2 == 0){
                encrypt += Math.floorMod(digit + SHIFT, 10) * Math.pow(10, numberLength-2);
            }else {
                encrypt += Math.floorMod(digit + SHIFT, 10) * Math.pow(10, numberLength);
            }
            numberLength--;
        }
        return String.format("%04d", encrypt);
    }
    
}
