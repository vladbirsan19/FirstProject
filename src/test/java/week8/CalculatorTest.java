package week8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        int sumResult = calculator.add(5, 10);
        assertEquals(15, sumResult);
    }

    @ParameterizedTest
    @CsvSource({"5, 15, 20", "0, 5, 5", "10, 10, 20"})

    void testAddingParametrized(String first, String second, String result){
        int add= calculator.add(Integer.parseInt(first),Integer.parseInt(second));
        assertEquals(Integer.parseInt(result),add);

    }

    @Test
    void testSubtract() {
        int subtractionResult = calculator.subtract(20, 1);

        assertEquals(19, subtractionResult);
    }

    @Test
    void testMultiply() {
        int multiplyResult = calculator.multiply(5, 20);
        assertEquals(100, multiplyResult);
    }

    @Test
    void testDivision() {
        double divisionResult = calculator.divide(10, 2);
        assertEquals(5.0, divisionResult);
    }
}
