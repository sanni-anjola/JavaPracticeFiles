package africa.semicolon.chapterThreeExercises;

public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance){

        this.name = name;
        if(balance >= 0){
            this.balance = balance;
        }

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 0){
            this.balance = balance;
        }
    }

    public void deposit(double amountToDeposit) {
        if(amountToDeposit > 0){
            this.balance = this.balance + amountToDeposit;
        }
    }

    public void withdraw(double withdrawalAmount) {
        if(withdrawalAmount > 0){
            if(this.balance > withdrawalAmount){
                this.balance = this.balance - withdrawalAmount;
            }
            System.out.println("Withdrawal Amount Exceeded account balance");
        }
    }

    public String displayAccount() {
        return String.format("%s balance: $%.2f", this.getName(), this.getBalance());
    }
}
