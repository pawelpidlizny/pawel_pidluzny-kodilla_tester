package kodilla.collections.adv.exercises.dictionary.homework;


import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {

        List<Flight> flightsTable =  new ArrayList<>();

        flightsTable.add(new Flight("Warsaw","Gdansk"));
        flightsTable.add(new Flight("Krakow","Rzeszow"));
        flightsTable.add(new Flight("Wrocla", "Warsaw"));
        flightsTable.add(new Flight("Warsaw","Krakow"));

        return flightsTable;
        }
}

