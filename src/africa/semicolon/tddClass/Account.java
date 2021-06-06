package africa.semicolon.tddClass;

public class Account {

    private double myAccountBalance;
    private String pin = "1234";

    public String getPin() {
        return pin;
    }

    public void setPin(String oldPin, String newPin) {
        if(this.pin.equals(oldPin)){

            this.pin = newPin;
        }
    }

    public void deposit(double amountToDeposit) {
        if(amountToDeposit > 0) {
            myAccountBalance = myAccountBalance + amountToDeposit;
        }
    }

    public double getAccountBalance() {
        return myAccountBalance;
    }


    public void withdraw(double amountToWithdraw, String pin) {
        if(this.pin.equalsIgnoreCase(pin)) {
            if (amountToWithdraw < 0) return;
            if (amountToWithdraw <= myAccountBalance)
                myAccountBalance = myAccountBalance - amountToWithdraw;
        }
    }
}
