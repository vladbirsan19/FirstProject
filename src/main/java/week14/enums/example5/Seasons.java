package week14.enums.example5;

// override a method only for a
// specific instance
public enum Seasons {

    SPRING, SUMMER {
        @Override
        public void rains() {
            System.out.println("sunny and bright");
        }
    }, AUTUMN, WINTER;


    public void rains() {
        System.out.println("raining");
    }

    // you can make .rains() abstract
    // but in that case you will need to override
    // the method in each instance -> SPRING, AUTUMN, WINTER

}
