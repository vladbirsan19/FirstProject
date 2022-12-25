package week14.annotations.example2;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class Example2 {

    public static void main(String[] args) {
        Student s1 =new Student (null, 20);
        Student s2 = new Student(null,15);
        Student s3 = new Student("Vlad", 20);

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<Student>> violations = validator.validate(s3);

        for (ConstraintViolation<Student> violation : violations) {
            System.out.println(violation.getMessage());
        }

    }

}
