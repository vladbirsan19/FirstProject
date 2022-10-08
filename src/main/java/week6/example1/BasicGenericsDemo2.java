package week6.example1;

public class BasicGenericsDemo2 {
    public static void main(String[] args) {


        // until java 1.4
        Person p2 = new Person();
        p2.z1 = "Vlad";
        p2.z1 = 10;

        // after java 1.7
        Person<String> p3 = new Person<String>();
        p3.x = "Vlad";
//        p3.x = 10; -> does not compile

        Person<Integer> p4 = new Person<Integer>();
        p4.x = 10;
//        p4.x = "Vlad"; -> does not compile
       }
}