package ro.ulbs.lab7;
import org.junit.jupiter.api.*;
import ro.ulbs.lab6.DoubleCalculator;
import ro.ulbs.lab6.NewIntCalculator;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {

    @Test
    public void testAddPositiveInt() {
        NewIntCalculator calc = new NewIntCalculator(5);
        calc.add(10);
        assertEquals(15, calc.result());
    }

    @Test
    public void testAddNegativeInt() {
        NewIntCalculator calc = new NewIntCalculator(5);
        calc.add(-3);
        assertEquals(2, calc.result());
    }

    @Test
    public void testSubtractPositiveInt() {
        NewIntCalculator calc = new NewIntCalculator(10);
        calc.subtract(4);
        assertEquals(6, calc.result());
    }

    @Test
    public void testSubtractNegativeInt() {
        NewIntCalculator calc = new NewIntCalculator(10);
        calc.subtract(-5);
        assertEquals(15, calc.result());
    }

    @Test
    public void testMultiplyPositiveInt() {
        NewIntCalculator calc = new NewIntCalculator(4);
        calc.multiply(3);
        assertEquals(12, calc.result());
    }

    @Test
    public void testMultiplyNegativeInt() {
        NewIntCalculator calc = new NewIntCalculator(4);
        calc.multiply(-2);
        assertEquals(-8, calc.result());
    }

    @Test
    public void testMultiplyByZeroInt() {
        NewIntCalculator calc = new NewIntCalculator(100);
        calc.multiply(0);
        assertEquals(0, calc.result());
    }


    @Test
    public void testAddPositiveDouble() {
        DoubleCalculator calc = new DoubleCalculator(2.5);
        calc.add(3.5);
        assertEquals(6.0, (Double) calc.result(), 0.0001);
    }

    @Test
    public void testAddNegativeDouble() {
        DoubleCalculator calc = new DoubleCalculator(2.5);
        calc.add(-1.5);
        assertEquals(1.0, (Double) calc.result(), 0.0001);
    }

    @Test
    public void testSubtractPositiveDouble() {
        DoubleCalculator calc = new DoubleCalculator(5.0);
        calc.subtract(1.5);
        assertEquals(3.5, (Double) calc.result(), 0.0001);
    }

    @Test
    public void testSubtractNegativeDouble() {
        DoubleCalculator calc = new DoubleCalculator(5.0);
        calc.subtract(-2.0);
        assertEquals(7.0, (Double) calc.result(), 0.0001);
    }

    @Test
    public void testMultiplyPositiveDouble() {
        DoubleCalculator calc = new DoubleCalculator(2.0);
        calc.multiply(3.0);
        assertEquals(6.0, (Double) calc.result(), 0.0001);
    }

    @Test
    public void testMultiplyNegativeDouble() {
        DoubleCalculator calc = new DoubleCalculator(2.0);
        calc.multiply(-3.0);
        assertEquals(-6.0, (Double) calc.result(), 0.0001);
    }

    @Test
    public void testMultiplyByZeroDouble() {
        DoubleCalculator calc = new DoubleCalculator(3.5);
        calc.multiply(0.0);
        assertEquals(0.0, (Double) calc.result(), 0.0001);
    }
    @Test
    public void testDividePositiveInt() {
        // Arrange
        NewIntCalculator calc = new NewIntCalculator(20);

        // Act
        calc.divide(4); // 20 / 4

        // Assert
        assertEquals(5, calc.result());
    }

    @Test
    public void testDivideNegativeInt() {
        // Arrange
        NewIntCalculator calc = new NewIntCalculator(20);

        // Act
        calc.divide(-5); // 20 / -5

        // Assert
        assertEquals(-4, calc.result());
    }
    @Test
    public void testDividePositiveDouble() {
        // Arrange
        DoubleCalculator calc = new DoubleCalculator(10.0);

        // Act
        calc.divide(2.5); // 10.0 / 2.5

        // Assert
        assertEquals(4.0, (Double) calc.result(), 0.0001);
    }

    @Test
    public void testDivideNegativeDouble() {
        // Arrange
        DoubleCalculator calc = new DoubleCalculator(10.0);

        // Act
        calc.divide(-2.0); // 10.0 / -2.0

        // Assert
        assertEquals(-5.0, (Double) calc.result(), 0.0001);
    }


    @Test
    public void testDivideByZeroInt() {
        NewIntCalculator calc = new NewIntCalculator(10);
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.divide(0);
        });
        assertEquals("Cannot divide by zero.", exception.getMessage());
    }

    @Test
    public void testDivideByZeroDouble() {
        DoubleCalculator calc = new DoubleCalculator(10.0);
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.divide(0.0);
        });
        assertEquals("Cannot divide by zero.", exception.getMessage());
    }

}

