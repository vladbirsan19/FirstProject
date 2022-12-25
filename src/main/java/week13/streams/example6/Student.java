package week13.streams.example6;

public class Student implements Comparable<Student> {

    private final Integer age;


    public Student(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int compareTo(Student s) {
        return this.age - s.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }
}
