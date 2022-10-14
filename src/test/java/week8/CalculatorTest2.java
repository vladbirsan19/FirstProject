package week8;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest2 {
    private static Calculator calculator;

    @BeforeAll
    static void beforeAll(){
        calculator = new Calculator();
        System.out.println("Message before all tests");
    }

    // before each test is executed
    // a new instance of Calculator is created
    @BeforeEach
    void before() {
        System.out.println("Message before each tests");
    }

    @AfterEach
    void after() {
        System.out.println("Finished message after each test");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Finished message after all tests");
    }

    @Test
    public void testAdding() {
        int sumResult = calculator.add(5, 10);
        assertEquals(15, sumResult);
    }

    @Test
    public void testSubtract() {
        int subtractionResult = calculator.subtract(20, 1);
        assertEquals(19, subtractionResult);
    }

}
