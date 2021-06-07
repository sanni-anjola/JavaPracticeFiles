package softwareEngineering.ekoTaxi;

public class Payment {
    private double amount;
    private boolean status;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double makePayment(){
        return 0.0;
    }

    public boolean completeOrder(){
        return false;
    }
}
