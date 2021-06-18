package africa.semicolon.chapterSixExercises;

public class TableOfBinOctAndHex {
//    public static int decToBaseTwoToNine(int number, int base){
//
//        int placeHolder = 1;
//        int result = 0;
//        while (number != 0){
//            result += (number % base) * placeHolder;
//            number /= base;
//            placeHolder *= 10;
//        }
//        return result;
//    }

    public static String convertdecNumberToAnyBase(int decimalNumber, int base){
        StringBuilder result = new StringBuilder();

        while (decimalNumber != 0){
            int digit = decimalNumber % base;
            if(digit >= 0 && digit <= 9){
                result.insert(0, digit);
            }
            if(digit >= 10){
               char digitChar = (char) (digit - 10 + 'A');
               result.insert(0, digitChar);
            }

            decimalNumber /= base;
        }
        return result.toString();
    }
}
