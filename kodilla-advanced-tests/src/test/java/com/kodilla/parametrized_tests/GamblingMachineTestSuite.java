package com.kodilla.parametrized_tests;

import kodilla.parametrized_tests.homework.InvalidNumbersException;
import kodilla.parametrized_tests.homework.com.kodilla.parametrized_tests.GamblingMachine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class GamblingMachineTestSuite {
    private final GamblingMachine machine = new GamblingMachine();

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldThrowWhenNumbersEmpty(Set<Integer> numbers) {
        Assertions.assertThrows(InvalidNumbersException.class, () -> {
            machine.howManyWins(numbers);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/numbersOutOfRange.cvs", numLinesToSkip = 1)
    public void shouldThrowWhenNumbersOutOfRange(String numbers) {
        Set<Integer> inputNumbers = convertStringToIntegerSet(numbers);
        Assertions.assertThrows(InvalidNumbersException.class, () -> {
            machine.howManyWins(inputNumbers);
        });

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/notSixNumbersDrawn.csv", numLinesToSkip = 1)
    public void shouldThrowWhenNotSixNumbersAreDrawn(String numbers) {
        Set<Integer> inputNumbers = convertStringToIntegerSet(numbers);
        Assertions.assertThrows(InvalidNumbersException.class, () -> {
            machine.howManyWins(inputNumbers);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/correctNumbers.csv", numLinesToSkip = 1)
    public void shouldNotThrowWhenNumbersCorrect(String numbers) {
        Set<Integer> inputNumbers = convertStringToIntegerSet(numbers);

        Assertions.assertDoesNotThrow(() -> {
            machine.howManyWins(inputNumbers);
        });
    }

    private Set<Integer> convertStringToIntegerSet(String numbers) {
        Set<Integer> inputNumbers = Arrays.stream(numbers.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        return inputNumbers;
    }
}