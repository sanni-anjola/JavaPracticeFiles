package africa.semicolon.chapter14;

import java.util.Scanner;

public class TokenizingPhoneNumber {
    public static void main(String[] args) {
//        String number = "(555) 555-5555";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a phoneNumber e.g (555) 555-5555: ");
        String number = scanner.nextLine();
        if(number.matches("[(]?(\\d{3})[)]?\\s+\\1-\\d{4}")){

            number = number.replaceAll("[()-]", "");
            System.out.println(number);
        }else {
            throw new IllegalArgumentException("Wrong input, it should be like (555) 555-5555");
        }
    }
}
