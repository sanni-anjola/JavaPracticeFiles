package africa.semicolon.bankApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        String welcomePage = """
                                #################################################################
                                #              Welcome to the GTB Bank Application              #
                                #                                                               #
                                #################################################################
                                #                                                               #
                                # Choose an option:                                             #
                                #                                                               #
                                #                1. Staff Login                                 #
                                #                2. Customer Login                              #
                                #                3. Exit App                                    #
                                #################################################################
                                """;

        int input;

        do {
            System.out.println(welcomePage);
            input = getInputFrom(inputCollector);

            switch (input){
                case 1: //Staff
                    System.out.println("Enter Your password: ");
                    String staffPassword = inputCollector.nextLine();
                    if(staffPassword.equals(Bank.bankStaff.getPassword())){
                        String staffWelcomePage = """
                                #################################################################
                                #              Welcome to the GTB Staff page                    #
                                #                                                               #
                                #################################################################
                                #                                                               #
                                # Choose an option:                                             #
                                #                                                               #
                                #                1. View All Bank Accounts                      #
                                #                2. Delete Accounts                             #
                                #                3. Logout                                      #
                                #################################################################
                                """;
                        do {
                            System.out.println(staffWelcomePage);
                            input = getInputFrom(inputCollector);
                            switch (input){
                                case 1: // View Bank Accounts
                                    break;
                                case 2: // Delete Account
                                    break;
                                case 3: break;
                                default:
                                    System.out.println("Invalid Option, try again");
                            }
                        }while (input != 3);
                    }else {
                        System.out.println("Incorrect login details");
                    }
                    break;
                case 2: //Customer
                    break;
                case 3:
                    System.out.println("Thank you for banking with us");
                    break;
                default:
                    System.out.println("Invalid option, please try again");
            }
        }while (input != 3);
    }

    private static String getMessage(String page, String message){
        return """
                                #################################################################
                                #              Welcome to the GTB %s                            #
                                #                                                               #
                                #################################################################
                                #                                                               #
                                # Choose an option:                                             #
                                #                                                               #
                                #                            %s                                 #
                                #################################################################
                                """.formatted(page, message);
    }

    private static int getInputFrom(Scanner inputCollector){
        int input;
        try {
            input = inputCollector.nextInt();
        }catch (InputMismatchException ex){
            inputCollector.nextLine();
            input = -1;
        }
        return input;
    }
}
