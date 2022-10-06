package week5.set;

import java.util.Objects;

public class PersonForSetWithCnp {
    private String name;
    private int cnp;

    public PersonForSetWithCnp(String name, int cnp) {
        this.name = name;
        this.cnp = cnp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonForSetWithCnp that = (PersonForSetWithCnp) o;
        return cnp == that.cnp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnp);
    }

    @Override
    public String toString() {
        return "PersonForSetWithCnp{" +
                "name='" + name + '\'' +
                ", cnp=" + cnp +
                '}';
    }
}
