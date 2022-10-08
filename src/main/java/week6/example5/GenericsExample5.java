package week6.example5;

public class GenericsExample5 {

    public static void main(String[] args) {

        // NEVER USE SOMETHING WITH GENERICS
        //WITHOUT GENERICS
        //WORKS ONLY BECAUSE JAVA HAS A STRONG
        // BACKWARDS COMPATIBILITY
        D d0= new D();

        D<String, Integer> d1 =new D<>();
        D<String,Double > d2 = new D<>();

        // id I don't specify anything for ?
        //OBJECT is added by default
        D<?, Integer> d3 = new D<Object,Integer>();
        D<?, Integer> d4 = new D<String, Integer>();
        D<?, ? extends  Number> d5 = new D <String, Double>();

    }
}
