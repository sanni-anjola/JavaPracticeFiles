package africa.semicolon.tddClass;

import java.util.Scanner;

public class AccountApplication {
    public static void main(String[] args) {
        String prompt = """                
                -> Enter 1 to deposit
                -> Enter 2 to Withdraw
                -> Enter 3 to set pin
                -> Enter 4 to exit
                """;

        Account account = new Account();
        Scanner scanner = new Scanner(System.in);
        int userInput;

        do{
            System.out.println(prompt);
            userInput = scanner.nextInt();

            switch (userInput){
                case 1: //deposit
                    System.out.print("Enter amount to deposit: ");
                    double amountToDeposit = scanner.nextDouble();
                    double previousBalance = account.getAccountBalance();
                    account.deposit(amountToDeposit);
                    if(account.getAccountBalance() > previousBalance) {
                        System.out.println("Deposit Successful");
                        System.out.println("Your new balance is: " + account.getAccountBalance());
                    }else {
                        System.out.println("Something went wrong!. Try again");
                    }
                    break;
                case 2: // withdraw
                    System.out.print("Enter your pin: ");
                    String pin = scanner.next();
                    previousBalance = account.getAccountBalance();
                    System.out.print("Enter amount to withdraw: ");
                    double amountToWithdraw = scanner.nextDouble();
                    account.withdraw(amountToWithdraw, pin);
                    if(account.getAccountBalance() < previousBalance) {
                        System.out.println("Withdrawal Successful");
                        System.out.println("Your new balance is: " + account.getAccountBalance());
                    }else {
                        System.out.println("Something went wrong!. Try again");
                    }
                    break;
                case 3: // pin
                    System.out.print("Enter the old pin: ");
                    String oldPin = scanner.next();
                    System.out.println("Choose a 4 digit pin");
                    System.out.print("Enter the new pin: ");
                    String newPin = scanner.next();
                    System.out.print("Confirm the new pin: ");
                    String confirmPin = scanner.next();
                    if(newPin.equals(confirmPin) && newPin.length() == 4){
                        account.setPin(oldPin, newPin);
                        System.out.println("Your pin changed successfully");
                    }else {
                        System.out.println("Something went wrong!. Try again");
                    }


                    break;
                case 4: break;
                default:
                    System.out.println("Invalid Input, try again");
            }

        }while (userInput != 4);

    }
}
