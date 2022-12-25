package week14.enums.example2;

public class Example2 {
    public static void main(String[] args) {
        Coffee medium = Coffee.MEDIUM;
        //enum is the only custom type of object
        //that can be used in switch statment

        switch (medium) {
            case SMALL:
                System.out.println("small");
                break;
            case MEDIUM:
                System.out.println("medium");
                break;
            case LARGE:
                System.out.println("large");
                break;
            default:
                System.out.println("default");
        }

        // enhanced switch
        switch (medium) {
            case SMALL -> System.out.println("small");
            case MEDIUM -> System.out.println("medium");
            case LARGE -> System.out.println("large");
            default -> System.out.println("default");
        }

    }
}
