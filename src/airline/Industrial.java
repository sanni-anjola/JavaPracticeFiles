package airline;

import airline.exception.InvalidBookingException;

public class Industrial extends Flight{
    @Override
    public void book(Payload payload) throws InvalidBookingException {

        if(!(payload instanceof Cargo || payload instanceof Employee) ){
            throw new InvalidBookingException("");
        }
        super.book(payload);
    }
}
