package practice.testingpractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualsFour(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4,calculator.add(2 , 2));
    }


}