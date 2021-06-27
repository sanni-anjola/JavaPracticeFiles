package africa.semicolon.bankApp;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Account{
    private BigDecimal balance;
    private static int numberOfAccounts;
    private final int accountNumber;
    private String accountPin;

    static {
        numberOfAccounts = 0;
    }

    {
        balance = BigDecimal.ZERO;
        accountPin = "1111";

    }

    public Account(){
        accountNumber = ++numberOfAccounts;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(String amountToDeposit){
        BigDecimal amount = new BigDecimal(amountToDeposit);
        if(amount.compareTo(BigDecimal.ZERO) > 0) {
            this.balance = balance.add(amount);
        }else {
            throw new IllegalArgumentException("You cannot deposit negative amount");
        }
    }

    public BigDecimal getBalance() {
        return balance.setScale(2, RoundingMode.HALF_UP);
    }

    public void withdraw(String amountToWithdraw){
        BigDecimal amount = new BigDecimal(amountToWithdraw);
        if(amount.compareTo(BigDecimal.ZERO) > 0){
            if(amount.compareTo(balance) < 0){
                this.balance = balance.subtract(amount);
            }else {
                throw new IllegalArgumentException("Insufficient Balance");
            }
        }else {
            throw new IllegalArgumentException("You cannot withdraw a negative amount");
        }
    }

    public void transfer(String amountToTransfer, Account beneficiaryAccount){
        this.withdraw(amountToTransfer);
        beneficiaryAccount.deposit(amountToTransfer);
    }

    static void resetNumberOfAccounts(){
        numberOfAccounts = 0;
    }

    public void changeAccountPin(String oldAccountPin, String newAccountPin) {
        if(!accountPin.equals(oldAccountPin)) return;
        this.accountPin = newAccountPin;
    }

    public String getAccountPin() {
        return accountPin;
    }


    @Override
    public String toString(){
        return "" + getAccountNumber();
    }
}
