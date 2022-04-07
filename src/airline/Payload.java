package airline;

public abstract class Payload extends Item{
    private double weight;
    public Payload(double wgt) {
        super();
        this.weight = wgt;
    }

    public double getWeight(){
        return weight;
    }


    @Override
    public String toString() {
        return String.format("ID: %d, Weight: %8.0f kg", id, getWeight());
    }
}
