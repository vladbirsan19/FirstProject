package week14.annotations.example3.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {
    private long minAge;

    @Override
    public void initialize(Age constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Integer age, ConstraintValidatorContext context) {
       if (age==null){
           return false;
       }
       return age>= minAge;

    }
}
