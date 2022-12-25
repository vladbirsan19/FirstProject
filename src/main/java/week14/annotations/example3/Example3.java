package week14.annotations.example3;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class Example3 {
    public static void main(String[] args) {

        Student s1 = new Student(null, 16, 60);
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<Student>> violations = validator.validate(s1);

        for (ConstraintViolation<Student>violation:violations){
            System.out.println(violation.getMessage());
        }

    }
}
