package week5.sorted.comparable;

import java.util.Objects;

public class PersonForTreeSetComparable implements Comparable {
    private String name;
    private int age;

    public PersonForTreeSetComparable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        return this.age - ((PersonForTreeSetComparable) o).age ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonForTreeSetComparable that = (PersonForTreeSetComparable) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "PersonForTreeSetComparable{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
