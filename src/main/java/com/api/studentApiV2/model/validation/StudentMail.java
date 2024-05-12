package com.api.studentApiV2.model.validation;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.ReportAsSingleViolation;
import jakarta.validation.constraints.Email;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = StudentMailValidator.class)
@Email(message = "Email should be a valid email address")
@ReportAsSingleViolation
public @interface StudentMail {
    String message() default "Email should end with @gmail.com";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
