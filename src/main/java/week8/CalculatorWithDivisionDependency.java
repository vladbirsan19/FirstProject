package week8;

public class CalculatorWithDivisionDependency {
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
        double divisionResult = new DivisionCalculator().divide(firstNumber, secondNumber);

        return divisionResult;
    }
}
