package week14.annotations.example3.validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {AgeValidator.class}) // selecting validator client
public @interface Age {

    long minValue();

    String message() default "Must be Greater than {minValue};";

    Class<?>[] groups() default {}; // mandatory

    // used to carry metadata information consumed by a validation client

    Class<? extends Payload>[]payload() default {}; // mandatory


}
