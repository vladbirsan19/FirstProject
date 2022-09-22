package week1;

public class CalculateSinCos {
    // Task - write a short program which reads a double number(let’s call it x)
    // from an input, calculates sin2(x) + cos2(x)

    public static void main(String[] args) {

        // read the 2 received arguments
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        //apply the Math .sin()/. cos() function and
        //use the result to raise to power 2 using . pow()
        double sin = Math.pow(Math.sin(a), 2);
        double cos = Math.pow(Math.cos(b), 2);

        //print result
        System.out.println(sin + cos);

    }
}

