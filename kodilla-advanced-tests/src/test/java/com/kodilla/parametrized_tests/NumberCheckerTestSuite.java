package com.kodilla.parametrized_tests;
import kodilla.parametrized_tests.NumberChecker;
import kodilla.parametrized_tests.StringValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class NumberCheckerTestSuite {

    private NumberChecker numberChecker = new NumberChecker();

    @Test
    public void shouldReturnTrueIfNumberEqualsThree() {
        boolean result = numberChecker.isDivisibleByThree(3);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIfNumberIsAMultipleOfThree() {
        boolean result = numberChecker.isDivisibleByThree(12);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIfNumberIsEqualsZero() {
        boolean result = numberChecker.isDivisibleByThree(0);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIfNumberIsANegativeMultipleOfThree() {
        boolean result = numberChecker.isDivisibleByThree(-6);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfNumberIsNotDivisibleByThree() {
        boolean result = numberChecker.isDivisibleByThree(2);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 3, 6, -3, -12, 15})
    public void shouldReturnTrueForNumberDivisibleByThree(int number) {
        boolean result = numberChecker.isDivisibleByThree(number);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-2, -1, 1, 2, 4, 5})
    public void shouldReturnFalseForNumberNotDivisibleByThree(int number) {
        boolean result = numberChecker.isDivisibleByThree(number);
        assertFalse(result);
    }

    private final StringValidator validator = new StringValidator();

    @Test
    public void shouldReturnFalseIfStringIsNotEmpty() {
        assertFalse(validator.isBlank("test"));
    }

    @Test
    public void shouldReturnTrueIfStringIsEmpty() {
        assertTrue(validator.isBlank(""));
    }

    @Test
    public void shouldReturnTrueIfStringHasOnlySpaces() {
        assertTrue(validator.isBlank("   "));
    }

    @Test
    public void shouldReturnTrueIfStringIsNull() {
        assertTrue(validator.isBlank(null));

    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmpty(String text) {
        System.out.println("|" + text + "|");
        assertTrue(validator.isBlank(text));
    }

    public static class StringManipulatorTestSuite {

        private StringValidator.StringManipulator manipulator = new StringValidator.StringManipulator();

        @ParameterizedTest
        @CsvSource(value = {"test,tset", "OtHEr,rehto", "EVent,tneve", "null,llun", "A,a"})
        public void shouldReverseStringWithLowerCase(String input, String expected) {
            Assertions.assertFalse(Boolean.parseBoolean(expected), manipulator.reverseWithLowerCase(input));
        }
    }
}