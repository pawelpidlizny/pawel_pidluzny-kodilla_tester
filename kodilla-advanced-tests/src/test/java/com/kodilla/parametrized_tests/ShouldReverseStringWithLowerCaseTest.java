package com.kodilla.parametrized_tests;

import kodilla.parametrized_tests.StringValidator;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;



class ShouldReverseStringWithLowerCaseTest {
    private final StringValidator.StringManipulator manipulator = new StringValidator.StringManipulator();

    @ParameterizedTest
    @CsvFileSource(resources = "/stringWithLowerCase.csv", numLinesToSkip = 1)
    public void shouldReverseStringWithLowerCase(String input, String expected) {
       Assertions.assertEquals (expected, manipulator.reverseWithLowerCase(input));
    }
}