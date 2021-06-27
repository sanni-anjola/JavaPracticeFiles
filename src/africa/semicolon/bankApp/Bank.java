package africa.semicolon.bankApp;

import java.util.ArrayList;

public class Bank {
    private final String bankName;
    private ArrayList<Customer> bankCustomers = new ArrayList<>();
    private Staff bankStaff = new Staff("Priest", "Oluwatobi");

    public Bank(String bankName){
        this.bankName = bankName;
    }

    public ArrayList<Customer> getBankCustomers() {
        return bankCustomers;
    }


    public Staff getBankStaff() {
        return bankStaff;
    }

    public String getBankName() {
        return bankName;
    }

    public Customer addCustomer(Customer newCustomer) {
        bankCustomers.add(newCustomer);
        return newCustomer;
    }

    public void removeCustomer(Customer customer) {
        bankCustomers.remove(customer);
    }

    public int getNumberOfBankCustomers(){
        return bankCustomers.size();
    }

    public boolean isBankCustomer(Customer customer){
        return bankCustomers.contains(customer);
    }

    public Customer findCustomerByName(String name){
        for (Customer bankCustomer : bankCustomers) {
            if (bankCustomer.getFullName().equalsIgnoreCase(name)) {
                return bankCustomer;
            }
        }
        return null;
    }

    public Customer findCustomerByAccountNumber(int accountNumber){
        for (Customer bankCustomer : bankCustomers) {
            if (bankCustomer.getCustomerAccount().getAccountNumber() == accountNumber) {
                return bankCustomer;
            }
        }
        return null;
    }
}
