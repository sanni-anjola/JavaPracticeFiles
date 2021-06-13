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

    public static String decToAnyBase(int number, int base){
        StringBuilder res = new StringBuilder();

        while (number != 0){
            int digit = number % base;
            if(digit >= 0 && digit <= 9){
                res.insert(0, digit);
            }
            if(digit >= 10){
               char digitChar = (char) (digit - 10 + 'A');
               res.insert(0, digitChar);
            }

            number /= base;
        }
        return res.toString();
    }
}
