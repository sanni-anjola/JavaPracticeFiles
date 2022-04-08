package airline;

import airline.exception.InvalidBookingException;

import java.util.ArrayList;
import java.util.List;

public abstract class Flight extends Item{
    private final List<Payload> payloadList = new ArrayList<>();
    final int MAX_WEIGHT = 200;
    final int MAX_PAYLOAD = 100;
    private boolean hasTakenOff;

    public Flight() {
        System.out.println(this);
    }

    public void book(Payload payload) throws InvalidBookingException {
        Double totalWeight = payloadList.stream().map(Payload::getWeight).reduce(0.0, Double::sum);
        if(totalWeight + payload.getWeight() > MAX_WEIGHT){
            throw new InvalidBookingException("Cannot load");
        }
        if(payloadList.size() >= MAX_PAYLOAD ){
            throw new InvalidBookingException("It is full");
        }
        payloadList.add(payload);
    }

    public boolean canTakeOff(){
        if(hasTakenOff || payloadList.size() <= 2){
            return false;
        }

        Payload payload= payloadList.stream().filter(Employee.class::isInstance).findFirst().orElse(null);
        return payload != null;
    }

    public String doTakeOff(){
        if(canTakeOff()){
            return String.format("Flight %d can take off", id);
        }
        return "Sorry, Flight cannot take off";
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + " Flight " + this.getId() +" has a payload of size " + payloadList.size();
    }

    public int getPayloadSize() {
        return payloadList.size();
    }
}
