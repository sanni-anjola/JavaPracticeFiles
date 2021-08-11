package africa.semicolon.chapter14;

public class ReverseString {
    public static void main(String[] args) {
        String phoneNumber = "68573565 432+";
        final int LENGTH = phoneNumber.length();
        for(int i = LENGTH - 1; i >= 0; i--){
            if(i < LENGTH - 6 && (i-1) % 3 == 0) System.out.print(" ");
            System.out.print(phoneNumber.charAt(i));
        }
        System.out.println();
    }

}
