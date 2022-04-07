package airline;

import airline.exception.InvalidBookingException;

import java.util.ArrayList;
import java.util.List;

public abstract class Flight {
    List<Payload> payloadList = new ArrayList<>();
    final int MAX_WEIGHT = 200;
    final int MAX_PAYLOAD = 100;

    public void book(Payload payload) throws InvalidBookingException {
        Double totalWeight = payloadList.stream().map(Payload::getWeight).reduce(0.0, Double::sum);
        if(totalWeight + payload.getWeight() > MAX_WEIGHT){
            throw new InvalidBookingException("Cannot load");
        }
        if(payloadList.size() >= 100 ){
            throw new InvalidBookingException("It is full");
        }
        payloadList.add(payload);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " Flight [a number] has a payload of size " + payloadList.size();
    }
}
