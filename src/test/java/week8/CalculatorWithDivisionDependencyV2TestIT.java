package week8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorWithDivisionDependencyV2TestIT {
    private CalculatorWithDivisionDependency calculator;

    @BeforeEach
    void init() {
        calculator = new CalculatorWithDivisionDependency();
    }

    // WHAT DO WE DO IF WE DON'T WANT TO TEST BOTH OF THE CLASSES
    // (CalculatorWithDivisionDependency, DivisionCalculator)
    // THIS IS INTEGRATION TEST
    // IT TESTS THE INTEGRATION BETWEEN BOTH CLASSES

    @Test
    void testDivision() {
        double divisionResult = calculator.divide(10, 2);
        Assertions.assertEquals(5.0, divisionResult);
    }
}
