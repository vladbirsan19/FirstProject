package week14.enums.example3;

public enum Coffee {
    // SMALL uses the constructor with 1 parameter
    // MEDIUM, LARGE uses the default constructor
    SMALL(10), MEDIUM, LARGE;

    private int quantity;

    private Coffee() { // private by default

    }

    Coffee(int quantity) { // private by default
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


