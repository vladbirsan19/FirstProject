package week1;

public class Operarori {
    public static void main(String[] args) {
        //Operatori matematici
        // + - * / %

        System.out.println(10 + 10);
        System.out.println(100 - 88);
        System.out.println(100 * 3);
        System.out.println(100 / 4);
        System.out.println(7 % 3);

        //Operatori rationali

        System.out.println(7 == 9);
        System.out.println(7 == 7);
        System.out.println(7 != 9);
        System.out.println(4 + 4 < 100);
        System.out.println(8 + 8 > 100);
        System.out.println(8 <= 10);
        System.out.println(8 >= 7);

        //Operatorii logici

        System.out.println(7 < 10 && 6 < 10);
        System.out.println(100 < 100 || 9 > 100);
        System.out.println(!true);

        //Operatorii de atribuire

        int numar = 5;
        numar++;
        System.out.println(numar);

        int numar2 = 8;
        numar2--;
        System.out.println(numar2);

        int numar3 = 10;
        numar3 += 20;
        System.out.println(numar3);
        numar3 = numar3 + 20;
        System.out.println(numar3);


    }
}
