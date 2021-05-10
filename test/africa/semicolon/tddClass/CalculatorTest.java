package africa.semicolon.tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator myCalculator;

    @BeforeEach
    void init(){
        myCalculator = new Calculator();
    }

    @Test
    public void testThatCalculatorCanAdd(){
        int sum = myCalculator.add(2,6);

        assertEquals(8, sum);

        sum = myCalculator.add(8, 11);
        assertEquals(19, sum);

    }

    @Test
    public void testThatCalculatorCanMultiply(){

        int product = myCalculator.multiply(3,4);

        assertEquals(12, product);
    }

    @Test
    public void testThatCalculatorCanSubtract(){
        int difference = myCalculator.subtract(8,3);

        assertEquals(5, difference);
    }

    @Test
    public void testThatCalculatorSubtractDoesNotReturnNegative(){
        int difference = myCalculator.subtract(8,3);
        assertEquals(5, difference);

        difference = myCalculator.subtract(3,8);
        assertEquals(5, difference);
    }

    @Test
    void testThatCalculatorCanDivide(){
        double quotient = myCalculator.divide(8, 2);

        assertEquals(4, quotient);
    }

    @Test
    void testThatCalculatorDoesNotDivideByZero(){
        double quotient = myCalculator.divide(5, 0);

        assertEquals(0.0, quotient);
    }
}
