package africa.semicolon.brainBreak;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String itemBought;
        double amountPerItem;
        int quantity;
        String prompt = "y";
        double total = 0;
        StringBuilder invoice = new StringBuilder(String.format("%3s | %-15s | %10s | %10s%n", "Qty", "Item", "Rate", "Price"));
        invoice.append(String.format("%s%n", "_".repeat(47)));
        do{
                System.out.print("What did he buy? ");
                itemBought = scanner.nextLine();
                System.out.print("How much per item? ");
                amountPerItem = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("How many pieces? ");
                quantity = scanner.nextInt();
                scanner.nextLine();
                invoice.append(String.format("%3d | %-15s | %10.2f | %10.2f%n", quantity, itemBought, amountPerItem, quantity * amountPerItem));
                total += amountPerItem * quantity;
                System.out.println("Enter 'yes' or 'y' to continue or any other key to exit");
                System.out.print("Did he buy more things? ");
                prompt = scanner.nextLine();

        }while ((prompt.equalsIgnoreCase("yes") || prompt.equalsIgnoreCase("y")));
        System.out.println("Your invoice is: ");
        System.out.println(invoice);
        System.out.println("Your total price is "+ total);
    }
}
