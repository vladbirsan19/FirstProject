package week4.thisexample;

public class Person {
    private String name;
    private String age;

    // this.name refers to the instance variable declared above
    // = name refers to the parameter received which has the same name
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
