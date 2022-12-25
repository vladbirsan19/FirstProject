package week9.example1;

public class ExceptionDemo4 {

    public static void main(String[] args) {
        createPerson();
    }

    public static void createPerson() {
        throw new UnsupportedOperationException();
    }

}
