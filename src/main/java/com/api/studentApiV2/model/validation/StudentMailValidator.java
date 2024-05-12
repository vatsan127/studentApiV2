package com.api.studentApiV2.model.validation;


import com.api.studentApiV2.config.ApplicationConfig;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StudentMailValidator implements ConstraintValidator<StudentMail, String> {
    private ApplicationConfig config;

    public StudentMailValidator(ApplicationConfig applicationConfig) {
        this.config = applicationConfig;
    }
/*

    @Override
    public void initialize(StudentMail constraintAnnotation) {
        // No initialization needed
    }
*/

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && value.endsWith(config.getMail());
    }
}
