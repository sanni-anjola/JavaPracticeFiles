package airline;

import airline.exception.InvalidBookingException;

public class Commercial extends Flight{
    @Override
    public void book(Payload payload) throws InvalidBookingException {
        System.out.println(payload.getClass().getSimpleName());
        String className = payload.getClass().getSimpleName();
        if(!(payload instanceof Person) ){
            throw new InvalidBookingException("");
        }
        super.book(payload);
    }
}
