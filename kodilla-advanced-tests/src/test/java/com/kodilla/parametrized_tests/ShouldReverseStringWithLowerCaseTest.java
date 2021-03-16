package com.kodilla.parametrized_tests;

import kodilla.parametrized_tests.StringValidator;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.stream.Stream;


class ShouldReverseStringWithLowerCaseTest {
    private final StringValidator.StringManipulator manipulator = new StringValidator.StringManipulator();

    @ParameterizedTest
    @CsvFileSource(resources = "/stringWithLowerCase.csv", numLinesToSkip = 1)
    public void shouldReverseStringWithLowerCase(String input, String expected) {
        Assertions.assertEquals(expected, manipulator.reverseWithLowerCase(input));
    }

    private static Stream<Arguments> provideStringsForTestingLength() {
        return Stream.of(
                Arguments.of("test", 4),
                Arguments.of("OtHEr ", 5),
                Arguments.of("E V e n t", 5),
                Arguments.of("null ", 4),
                Arguments.of("A", 1)
        );
    }
}