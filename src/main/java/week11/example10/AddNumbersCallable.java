package week11.example10;

import java.util.concurrent.Callable;

public class AddNumbersCallable implements Callable<Integer> {

    private final int number1;
    private final int number2;

    public AddNumbersCallable(Integer number1, Integer number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public Integer call() throws Exception {
        return number1 + number2;
    }
}
