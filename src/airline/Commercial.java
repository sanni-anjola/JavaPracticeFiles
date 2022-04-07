package airline;

import airline.exception.InvalidBookingException;

public class Commercial extends Flight{


    @Override
    public void book(Payload payload) throws InvalidBookingException {

        if(!(payload instanceof Person) ){
            throw new InvalidBookingException("");
        }
        super.book(payload);
    }
}
