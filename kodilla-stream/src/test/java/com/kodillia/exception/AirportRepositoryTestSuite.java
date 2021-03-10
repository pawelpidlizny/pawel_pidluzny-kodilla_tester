package com.kodillia.exception;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AirportRepositoryTestSuite {

    @Test
    public void testIsAirportInUse() throws AirportNotFoundException {
        // given
        AirportRepository airportRepository = new AirportRepository();
        // when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");
        // then
        Assertions.assertTrue(isWarsawInUse);

    }
    @Test
    public void testIsAirportInUse_withException() throws AirportNotFoundException {
        // given
        AirportRepository airportRepository = new AirportRepository();
        // then
        Assertions.assertThrows(AirportNotFoundException.class,()-> airportRepository.isAirportInUse("Viennna"));
    }
}