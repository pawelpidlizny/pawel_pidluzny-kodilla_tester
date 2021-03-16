package com.kodilla.parametrized_tests;

import kodilla.parametrized_tests.homework.com.kodilla.parametrized_tests.homework.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PersonTestSuite {
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.BmiTestSources#provideDoublesForTestingOutcomeMessage")
    public void shouldPrintAppropriateMessageAccordingToBmiCalculated(Double weight, Double height, String expected) {
        Person person = new Person(height, weight);
        Assertions.assertEquals(expected, person.getBMI());
    }
}
