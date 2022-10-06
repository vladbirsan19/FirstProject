package week5.set;

import java.util.Objects;

public class PersonForSet {
    private String name;

    public PersonForSet(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonForSet personForSet = (PersonForSet) o;
        return Objects.equals(name, personForSet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
