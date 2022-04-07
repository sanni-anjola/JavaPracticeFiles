package airline;

import airline.exception.InvalidInputException;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    Item item;
    List<Flight> flights = new ArrayList<>();
    List<Payload> payloads = new ArrayList<>();

    public String addFlight(char type) throws InvalidInputException {
        if(type == 'C'){
            Flight flight = new Commercial();
            flights.add(flight);
            return "Commercial Flight " + flight.getId() + " has a payload size of " + flight.getPayloadSize();
        }
        if(type == 'I'){
            Flight flight = new Industrial();
            flights.add(flight);
            return "Industrial Flight " + flight.getId() + " has a payload size of " + flight.getPayloadSize();

        }
        throw new InvalidInputException("Flight Creation Command Incorrect");
    }

    public Flight getFlight(int id){
        return flights.stream().filter(f -> f.getId() == id).findFirst().orElse(null);
    }


}
