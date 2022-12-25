package week14.enums.example2;

public enum Coffee {
    // SMALL uses the constructor with 1 param
    // MEDIUM , LARGE uses the default constructor

    SMALL(10), MEDIUM, LARGE;
    private int quantity;

    private Coffee() {//private by default
    }

    Coffee(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
