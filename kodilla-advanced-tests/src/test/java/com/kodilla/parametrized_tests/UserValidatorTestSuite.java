package com.kodilla.parametrized_tests;
import kodilla.parametrized_tests.homework.UserValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class UserValidatorTestSuite {
    private final UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"MaG-D_a.1", "ab2"})
    public void shouldReturnTrueIfConditionMatches(String username) {
        Assertions.assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Ma!-D_a.1", "aa"})
    public void shouldReturnFalseIfUsernameRequirementsNotMet (String username){
            Assertions.assertFalse(userValidator.validateUsername(username));

    }

    @ParameterizedTest
    @ValueSource(strings = {"a-A_5@C-b5.com", "a-A_5.a-A_5@C-b5.C-b5.com", "a@b.c", "a.1@b.2.europe"})
    public void shouldReturnTrueIfEmailRequirementsMet(String email) {
        Assertions.assertTrue(userValidator.validateEmail(email));
    }



    @ParameterizedTest
    @ValueSource(strings = {"a!A_5@C-b5.com", "aA_5@C-b$5.com", "a-A_5.a&A_5@C-b5.C-b5.com",
            "a-A_5.a-A_5@C-b5ą.C-b5.com", "@b.c", "a.@b.c", "a.b@.pl", "a@", "a@b.", "a@b.abcdefg", " "})
    public void shouldReturnFalseIfEmailRequirementsNotMet(String email) {
        Assertions.assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnTrueIfEmailIsEmpty(String email) {
        Assertions.assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfEmailIsNull(String email) {
       Assertions.assertFalse(userValidator.validateEmail(email));
    }
}