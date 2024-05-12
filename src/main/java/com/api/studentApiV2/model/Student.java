package com.api.studentApiV2.model;


import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Validated
public record Student(

        Long stdId,
        @NotBlank(message = "Name is required")
        @Size(min = 3, message = "Name should have minimum 3 characters")
        String stdName,

        @Email @NotBlank(message = "Email is required")
        @Size(min = 3, message = "Name should have minimum 3 characters")
        String stdEmail,

        @Valid
        Address Address

) {
}
