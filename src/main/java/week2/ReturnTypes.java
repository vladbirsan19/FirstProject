package week2;

public class ReturnTypes {
    public static void main(String[] args) {
        //void means no return type
        m1();
        int amount= m2(5,20);
        System.out.println("Amount is :" +amount);
    }

    public static void m1(){System.out.println(":)");}

    //return type can be any of the dataTypes that we learned
    public static int m2(int a, int b){

        int sum = a+ b;

        return sum;

    }
}
