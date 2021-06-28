package africa.semicolon.bankApp;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) throws CloneNotSupportedException {
        Bank bank = new Bank("GTB");
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
            inputCollector.nextLine();
            switch (input) {
                case 1 -> { //Staff
                    System.out.println("Enter Your password: ");
                    String staffPassword = inputCollector.nextLine();
                    if (staffPassword.equals(bank.getBankStaff().getPassword())) {
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
                        int staffInput;
                        do {
                            System.out.println(staffWelcomePage);
                            staffInput = getInputFrom(inputCollector);
                            inputCollector.nextLine();

                            switch (staffInput) {
                                case 1 : { // View Bank Accounts
                                    viewAccounts(bank);
                                    break;
                                }
                                case 2 : { // Delete Account
                                    deleteCustomerAccount(bank, inputCollector);
                                    break;
                                }
                                case 3 : break;
                                default : System.out.println("Invalid Option, try again");
                            }
                        } while (staffInput != 3);
                    } else {
                        System.out.println("Incorrect login details");
                    }
                }
                case 2 -> { //Customer
                    String customerWelcomePage = """
                            #################################################################
                            #              Welcome to the GTB Customer page                 #
                            #                                                               #
                            #################################################################
                            #                                                               #
                            # Choose an option:                                             #
                            #                                                               #
                            #                1. Create Account                              #
                            #                2. Login Accounts                              #
                            #                3. Go back                                     #
                            #################################################################
                            """;
                    int customerInput;
                    do {
                        System.out.println(customerWelcomePage);
                        customerInput = getInputFrom(inputCollector);
                        switch (customerInput) {
                            case 1: // Create Account
                                Customer newCustomer = getCustomerDetailsFrom(inputCollector);
                                if(newCustomer != null){
                                    bank.addCustomer(newCustomer);
                                    logInCustomer(inputCollector, newCustomer, bank);
                                }
                                break;
                            case 2: // Login Account
                                System.out.println("Enter Your account number: ");
                                int customerAccountNumber = getInputFrom(inputCollector);
                                inputCollector.nextLine();
                                Customer customer = bank.findCustomerByAccountNumber(customerAccountNumber);
                                if(customer != null) {
                                    System.out.println("Enter Your pin: ");
                                    String customerAccountPin = inputCollector.nextLine();
                                    if(customerAccountPin.equals(customer.getCustomerAccount().getAccountPin())){
                                        logInCustomer(inputCollector, customer, bank );
                                    }else {
                                        System.out.println("Invalid Pin");
                                    }

                                }else{
                                    System.out.println("Customer does not exist in the System");
                                }

                            case 3:
                                break;
                            default:
                                System.out.println("Invalid Option, try again");
                        }
                    } while (customerInput != 3);
                }
            }
            }while (input != 3);

    }

    private static void deleteCustomerAccount(Bank bank, Scanner inputCollector) throws CloneNotSupportedException {
        System.out.println("Which customer will you like to remove? ");
        String deleteOption = """
                                            1. Delete by Name
                                            2. Delete by Account Number
                                            """;
        System.out.println(deleteOption);
        int input;
        input = getInputFrom(inputCollector);
        inputCollector.nextLine();
        int numberOfCustomers = bank.getNumberOfBankCustomers();
        if (input == 2) {
            System.out.print("Enter Customer Account number: ");
            int accountNumber = getInputFrom(inputCollector);
            bank.removeCustomer(bank.findCustomerByAccountNumber(accountNumber));
            if(numberOfCustomers > bank.getNumberOfBankCustomers()) {
                System.out.println("Customer Account deleted successfully");
                viewAccounts(bank);
            }
            else
                System.out.println("Nothing to delete, check your input");
        } else if (input == 1) {
            System.out.print("Enter Customer's full name : ");
            String customerName = inputCollector.nextLine().trim();
            bank.removeCustomer(bank.findCustomerByName(customerName));
            if(numberOfCustomers > bank.getNumberOfBankCustomers()) {
                System.out.println("Customer Account deleted successfully");
                viewAccounts(bank);
            }
            else
                System.out.println("Nothing to delete, check your input");
        } else {
            System.out.println("Invalid option");
        }
    }

    private static void viewAccounts(Bank bank) throws CloneNotSupportedException {
        System.out.printf("%3s | %7s | %10s | %10s | %15s | %7s%n",
                "S/N", "Acc. No", "First Name", "Last name", "Address", "Date of birth");
        int serial = 1;
        for (Customer customer : bank.getBankCustomers()) {
            System.out.printf("%3d | %7d | %10s | %10s | %15s | %7s%n",
                    serial++, customer.getCustomerAccount().getAccountNumber(), customer.getFirstName(),
                    customer.getLastName(), customer.getAddress(), customer.getDateOfBirth());
        }
    }

    private static void logInCustomer(Scanner inputCollector, Customer customer, Bank bank) {
        String customerLoginPage = """
                                        #################################################################
                                        #              Welcome to the GTB Customer page                 #
                                        #                                                               #
                                        #################################################################
                                        #                                                               #
                                        # Choose an option:                                             #
                                        #                                                               #
                                        #                1. Deposit                                     #
                                        #                2. Withdraw                                    #
                                        #                3. Transfer                                    #
                                        #                4. Load Time                                   #
                                        #                5. Balance                                     #
                                        #                6. Log out                                     #
                                        #                7. Close Account                               #
                                        #################################################################
                                        """;
        int input;
        do {
            System.out.println(customerLoginPage);
            input = getInputFrom(inputCollector);
            inputCollector.nextLine();

            switch (input){
                case 1: //Deposit
                    depositTo(customer, inputCollector);
                    break;
                case 2: // withdraw
                    withdrawAmount(inputCollector, customer, "withdraw");
                    break;
                case 3: // transfer
                    transferFrom(bank, inputCollector, customer);
                    break;
                case 4: // load airtime
                    withdrawAmount(inputCollector, customer, "of airtime to load");
                    break;
                case 5: // balance
                    System.out.println(customer.getFullName());
                    System.out.print("Your account balance is: ");
                    System.out.println(NumberFormat.getCurrencyInstance().format(customer.getCustomerAccount().getBalance()));
                case 6: // logout
                    break;
                case 7: // close account
                    bank.removeCustomer(customer);
                    break;
                default:
                    System.out.println("Invalid Option, try again");
            }
        }while (!(input == 6 || input == 7));
    }

    private static Customer getCustomerDetailsFrom(Scanner inputCollector) {
        try {
            System.out.print("Enter First Name: ");
            String firstName = inputCollector.next();
            System.out.print("Enter Last Name: ");
            String lastName = inputCollector.next();
            System.out.print("Enter Phone Number: ");
            String phoneNumber = inputCollector.next();
            System.out.print("Enter House number: ");
            int houseNumber = inputCollector.nextInt();
            System.out.print("Enter Street name: ");
            String streetName = inputCollector.next();
            inputCollector.nextLine();
            System.out.print("Enter City name: ");
            String cityName = inputCollector.next();
            System.out.print("Enter Day of birth: ");
            int dayOfBirth = inputCollector.nextInt();
            System.out.print("Enter Month of Birth: ");
            int monthOfBirth = inputCollector.nextInt();
            System.out.print("Enter Year of birth: ");
            int yearOfBirth = inputCollector.nextInt();

            String customerString = """
                                        Details entered:
                                        Full Name: %s
                                        Phone Number: %s
                                        Address: %s
                                        Date of Birth: %s
                                        """.formatted(firstName + " " + lastName,
                    phoneNumber,
                    houseNumber + " " + streetName + " " + cityName,
                    dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth);
            Address customerAddress = new Address(houseNumber, streetName, cityName);
            Date customerDateOfBirth = new Date(dayOfBirth, monthOfBirth, yearOfBirth);
            System.out.println(customerString);
            return new Customer(firstName, lastName, phoneNumber, customerAddress, customerDateOfBirth);
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
            return null;
        }
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

    private static boolean isNumeric(String numberString){
        try {
            Double.parseDouble(numberString);
            return true;
        }catch (NumberFormatException ex){
            return false;
        }
    }

    private static void depositTo(Customer customer, Scanner inputCollector) {
        System.out.print("Enter amount to deposit: ");
        String amountToDeposit = inputCollector.nextLine();
        if(isNumeric(amountToDeposit)){
            customer.getCustomerAccount().deposit(amountToDeposit);
        }else {
            System.out.println("Invalid Number format");
        }
    }

    private static void withdrawAmount(Scanner inputCollector, Customer customer, String purpose){
        System.out.printf("Enter amount to %s: ", purpose);
        String amountToWithdraw = inputCollector.nextLine();
        if(isNumeric(amountToWithdraw)){
            customer.getCustomerAccount().withdraw(amountToWithdraw);
            displayTransactionDetails("withdraw", customer, amountToWithdraw);
        }else {
            System.out.println("Invalid Number format");
        }
    }

    private static void transferFrom(Bank bank, Scanner inputCollector, Customer customer) {
        System.out.print("Enter beneficiary account number: ");
        int beneficiaryAccountNumber = getInputFrom(inputCollector);
        inputCollector.nextLine();
        System.out.print("Enter amount to Transfer: ");
        String amountToTransfer = inputCollector.nextLine();
        Customer beneficiaryCustomer = bank.findCustomerByAccountNumber(beneficiaryAccountNumber);
        if(beneficiaryCustomer != null) {
            if (isNumeric(amountToTransfer)) {
                customer.getCustomerAccount().transfer(amountToTransfer, beneficiaryCustomer.getCustomerAccount());
                displayTransactionDetails("transfer", customer, amountToTransfer);
            } else {
                System.out.println("Invalid Number format");
            }
        }else {
            System.out.println("Beneficiary Account Does not exist");
        }
    }

    private static void displayTransactionDetails(String transactionType, Customer customer, String amount){
        String type;
        if(transactionType.equalsIgnoreCase("deposit")) type = "CR";
        else type = "DR";

        System.out.printf("Acct: %d%n", customer.getCustomerAccount().getAccountNumber());
        System.out.printf("Amt: %s %s%n", NumberFormat.getCurrencyInstance().format(amount), type);
        System.out.printf("Available Bal: %s%n", NumberFormat.getCurrencyInstance().format(customer.getCustomerAccount().getBalance()));
    }
}
