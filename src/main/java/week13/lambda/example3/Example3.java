package week13.lambda.example3;

public class Example3 {
    public static void main(String[] args) {
        //Focus on the Right side

        Z z1= () ->5;
        Z z2 = ()-> m();
        //"return" works only inside a block of code
        Z z3 = () ->{return 5;};

    }

    static int m(){return 5;}
}
