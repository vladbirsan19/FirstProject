package week14.annotations.example3;

import week14.annotations.example3.validation.Age;

public class Student {

    private String name;

    @Age(minValue=18)
    private Integer age;

    @Age(minValue = 65)
    private Integer age2;

    public Student(String name, Integer age, Integer age2){
        this.name = name;
        this.age=age;
        this.age2=age2;

    }
}
