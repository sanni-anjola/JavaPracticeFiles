package softwareEngineering.ecommerce;

public class Order {
    private String orderCode;
    private String orderDate;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public boolean orderStatus(){
        return false;
    }

    public boolean paymentStatus(){
        return false;
    }

    public String processOrder(){
        return null;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
}
