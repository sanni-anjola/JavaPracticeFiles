package africa.semicolon.brainBreak;

public class Item {
    private final String itemName;
    private final double price;
    private final int quantity;

    public Item(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice(){
        return price * quantity;
    }
}
