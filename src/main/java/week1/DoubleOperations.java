package week1;

public class DoubleOperations {
    public static void main(String[] args) {

        double a = Double.parseDouble(args[0]);
        float b =2f;
        float c =3f;
        float d =1f;
        double e = Double.parseDouble(args[1]);

        a = Math.toRadians(a);
        e = Math.toRadians(e);

            System.out.println("Math.sin("+ a +") =" + Math.sin(a));
            System.out.println("Math.sin("+ b +") =" + Math.sin(b));
            System.out.println("Math.sin("+ c +") =" + Math.sin(c));
            System.out.println("Math.sin("+ d +") =" + Math.sin(d));
            System.out.println("Math.sin("+ e +") =" + Math.sin(e));





    }
}
