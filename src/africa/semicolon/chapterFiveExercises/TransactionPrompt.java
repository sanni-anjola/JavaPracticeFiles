package africa.semicolon.chapterFiveExercises;

import java.util.Scanner;

public class TransactionPrompt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int prompt;
        do {
            String transactionPrompt = """
                    -> Enter 1 for deposit
                    -> Enter 2 for Withdraw
                    -> Enter 3 to view All account
                    -> Enter 4 to transfer
                    -> Enter 5 to view your details
                    -> Enter 6 to exit
                    -> Enter 7 to logout
                    """;
            System.out.print(transactionPrompt);
            prompt = input.nextInt();
            if(prompt == 1){
                System.out.println("deposit");
            }else if(prompt == 2){
                System.out.println("withdraw");
            }else if(prompt == 3){
                System.out.println("view all App");
            }else if(prompt == 4){
                System.out.println("transfer");
            }else if (prompt == 5){
                System.out.println("view your details");
            }else if(prompt == 6){
                System.out.println("exiting...");
            }else if(prompt == 7){
                System.out.println("logout");
            }else {
                System.out.println("Invalid option");
            }
        }while (prompt != 6);
    }
}
