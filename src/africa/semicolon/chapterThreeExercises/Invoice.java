package africa.semicolon.chapterThreeExercises;

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantityPerItem;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantityPerItem, double pricePerItem){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        if(quantityPerItem > 0) { this.quantityPerItem = quantityPerItem; }
        if(pricePerItem > 0.0) { this.pricePerItem = pricePerItem; }
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return this.partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return this.partDescription;
    }

    public void setQuantityPerItem(int quantityPerItem) {
        if(quantityPerItem > 0) { this.quantityPerItem = quantityPerItem; }
    }

    public int getQuantityPerItem() {
        return this.quantityPerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if(pricePerItem > 0.0) { this.pricePerItem = pricePerItem; }
    }

    public double getPricePerItem() {
        return this.pricePerItem;
    }

    public double getInvoiceAmount() {
        return this.pricePerItem * this.quantityPerItem;
    }
}
