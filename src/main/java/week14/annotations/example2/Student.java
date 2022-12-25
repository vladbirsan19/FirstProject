package week14.annotations.example2;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Student {

    @NotNull(message = "Name cannot be null")
    private String name;

    @Min(value = 18, message = "Age should not be less than 18")
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
