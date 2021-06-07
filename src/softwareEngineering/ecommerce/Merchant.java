package softwareEngineering.ecommerce;

public class Merchant {
    private String name;
    private String email;
    private String merchantId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public boolean supplyOrder(){
        return false;
    }

    public boolean paymentStatus(){
        return false;
    }
}
