package week5.map;

import java.util.Objects;

public class PersonForMap {

    private String name;

    public PersonForMap(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonForMap that = (PersonForMap) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "PersonForMap{" +
                "name='" + name + '\'' +
                '}';
    }
}
