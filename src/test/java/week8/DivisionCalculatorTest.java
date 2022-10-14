package week8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisionCalculatorTest {


    private final DivisionCalculator divisionCalculator = new DivisionCalculator();

    @Test
    void testDivision() {
        double divide = divisionCalculator.divide(10, 2);
        Assertions.assertEquals(5.0, divide);
    }

    @Test
    void testDivisionWithZeroParameter() {
        double divide = divisionCalculator.divide(10, 0);
        Assertions.assertEquals(0.0, divide);
    }
}
