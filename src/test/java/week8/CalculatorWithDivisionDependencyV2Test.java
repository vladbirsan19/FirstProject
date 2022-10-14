package week8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;


@ExtendWith(MockitoExtension.class)
public class CalculatorWithDivisionDependencyV2Test {

    private CalculatorWithDivisionDependencyV2 calculator;

    @Mock
    private DivisionCalculator divisionCalculator;

    @BeforeEach
    void setUp() {
        calculator = new CalculatorWithDivisionDependencyV2(divisionCalculator);
    }

    @Test
    void testDivision() {
        Mockito.when(divisionCalculator.divide(10, 2)).thenReturn(3.0);

        double divide = calculator.divide(10, 2);
        Assertions.assertEquals(3.0, divide);
    }

    @Test
    void testDivisionV2() {
        Mockito.when(divisionCalculator.divide(any(Integer.class), any(Integer.class))).thenReturn(8.0);

        double divide = calculator.divide(10, 2);
        Assertions.assertEquals(8.0, divide);
    }

}
