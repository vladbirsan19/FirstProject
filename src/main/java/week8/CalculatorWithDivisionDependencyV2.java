package week8;

public class CalculatorWithDivisionDependencyV2 {

    private final DivisionCalculator divisionCalculator;

    public CalculatorWithDivisionDependencyV2(DivisionCalculator divisionCalculator) {
        this.divisionCalculator = divisionCalculator;

    }

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divide(int firstNumber, int secondNumber) {
        double divisionResult = divisionCalculator.divide(firstNumber, secondNumber);

        return divisionResult - 1;
    }
}
