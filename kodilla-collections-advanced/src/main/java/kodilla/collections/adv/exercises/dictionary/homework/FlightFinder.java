package kodilla.collections.adv.exercises.dictionary.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public List <Flight> flightList;

    public FlightFinder() {
        flightList = FlightRepository.getFlightsTable();

    }
    public List<Flight> findFlightsFrom (String departure) {
        List<Flight> flightsFrom = new ArrayList<>();
        for (Flight flights : flightList) {
            if (flights.getDeparture().equals(departure)) {
            flightsFrom.add(flights);

            }
        }
        return flightsFrom;
    }
    public  List<Flight> findFlightsTo(String arrival){
        List<Flight> flightsTo = new ArrayList<>();
        for (Flight flights: flightList){
            if (flights.getArrival().equals(arrival)){
                flightsTo.add(flights);
            }
        }
        return flightsTo;
    }


    public void flightList(Flight flight) {
    }
}
