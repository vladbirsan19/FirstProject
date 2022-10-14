package week8;

public class DivisionCalculator {

    public  double divide (int firstNumber, int secondNumber){
        if (secondNumber ==0){
            System.out.println("Division by 0 not possible");
            return 0.0;
        }
        return (double)  firstNumber/secondNumber;
    }

}
