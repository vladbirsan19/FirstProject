package week4.tostring;

public class Person {
    private String name;
    private String age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
