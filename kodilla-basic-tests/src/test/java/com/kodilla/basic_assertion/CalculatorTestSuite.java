package com.kodilla.basic_assertion;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        Assertions.assertEquals(13, sumResult);

        boolean correct = ResultChecker.assertEquals(13,sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + " " + a + "" + "i" + " " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb" + " " + " " + a + " " + "i" + " " + b);
        }
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int x = 5;
        int y = 8;
        int subtractResult = calculator.subtract(x, y);
        Assertions.assertEquals(-3, subtractResult);

        boolean subtract = ResultChecker.assertEquals(13, subtractResult);
        if (subtract) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + x + " i " + y);

        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + x + " i " + y);
        }
    }
    @Test
    public void testPower() {
        Calculator calculator = new Calculator();
        int z = 8;
        int powerResult = calculator.power(z);
        Assertions.assertEquals(64,powerResult);
        boolean correctPower = ResultChecker.assertEquals(64,powerResult);

        if (correctPower){
            System.out.println("Metoda power działa poprawnia dlia liczb " + z );
        } else {
            System.out.println("Metoda power nie działa poprawnie dla liczb " + z);
        }
    }
}