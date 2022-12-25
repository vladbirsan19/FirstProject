package week14.enums.example1;

//ENUM is a special type of class
//uses "enum" keyword
//enum is a "final class" -cannot be extended
// constructors are only PRIVATE
//instances are always static final
//instances cannot be created later
public enum Coffee {

    //instance of Coffee
    // instances are the first line in an ENUM - otherwise it will not compile

    SMALL, MEDIUM, LArge;

    private int quantity;

    // implicit ->explicit constructor

    Coffee() {//private by default
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    //alternative to enum with regular class
    //but much shorter with enum


}

final class Coffee1 {
    public final static Coffee1 SMALL = new Coffee1();
    public final static Coffee1 MEDIUM = new Coffee1();
    public final static Coffee1 LARGE = new Coffee1();

    private Coffee1() {

    }
}
