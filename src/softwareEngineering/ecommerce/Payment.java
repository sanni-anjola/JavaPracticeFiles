package softwareEngineering.ecommerce;

public class Payment {
    private double amount;
    private String paymentMode;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String makePayment(){
        return null;
    }

    public String processPayment(){
        return null;
    }
}
