package week4.finalmodifier.fieldmodifier;

public class Person {
    // not final, can be initialized from anywhere
    // only declared
    public int age;

    // declaration and initialization
    // final - option 1
    public final char gender = 'M';

    // declaration + constructor initialization
    public final String name;

    // final - option 2
    public Person(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                '}';
    }
}
