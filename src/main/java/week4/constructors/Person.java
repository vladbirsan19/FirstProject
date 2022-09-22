package week4.constructors;

public class Person extends LivingBeing {
    private String name;
    private String age;

    // explicit constructor
    public Person() {
        //refers to the parent constructor
        // mandatory to be the first line of the constructor
        super("male");
        // this is explicit calling the parent constructor
        // but, it's always the first line event if it's not seen
    }

    // (explicit) constructor with params
    public Person(String name) {
        // constructor chaining
        this("0", name);        // refers to the property of the current instance
        this.name = name;
    }

    public Person(String age, String name) {
        super("male");
        this.age = age;
        this.name = name;
    }

    //this is a method
    public void saySomething() {
        // do something
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
