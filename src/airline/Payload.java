package airline;

import airline.exception.InvalidInputException;

public abstract class Payload extends Item{
    private double weight;
    public Payload(double wgt) {
        super();
        this.weight = wgt;
    }

    public static Payload payloadFactory(String payloadType, String weight, String firstName, String lastName, String job) throws InvalidInputException {
        double wgt = Double.parseDouble(weight);
        if(payloadType.equals("P")) {
            return new Person(firstName, lastName, wgt);
        }
        if(payloadType.equals("E")) {
            return new Employee(firstName, lastName, wgt, job);
        }
        if(payloadType.equals("C")) {
            return new Cargo(wgt);
        }

        throw new InvalidInputException("Payload creation command incorrect");
    }

    public double getWeight(){
        return weight;
    }


    @Override
    public String toString() {
        return String.format("ID: %d, Weight: %8.0f kg", id, getWeight());
    }
}
