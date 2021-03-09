package kodilla.collections.adv.exercises.dictionary.homework;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


public class FlightFinderTestSuite {

    @Test
    public void checkAllFlightsFromDestination() {
        //Given
        FlightFinder flightFinder = new FlightFinder();
        //When
        List<Flight> departures = flightFinder.findFlightsFrom("Warsaw");
        //Then
        Assertions.assertEquals(2, departures.size());
    }
    @Test
    public void checkAllFlightsToDestination(){
        //Given
        FlightFinder flightFinder = new FlightFinder();
        //When
        List<Flight> arrival = flightFinder.findFlightsTo("Krakow");
        //Then
        Assertions.assertEquals(1,arrival.size());
    }
}