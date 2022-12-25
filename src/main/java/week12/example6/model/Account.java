package week12.example6.model;

import java.math.BigDecimal;

// POJO class (plain old java object)
public class Account {

    private int id;
    private BigDecimal amount;

    public Account(int id, BigDecimal amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
