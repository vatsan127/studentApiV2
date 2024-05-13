package com.api.studentApiV2.model;


import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Valid
public record Student(

        Long id,
        @NotBlank(message = "Name is required")
        @Size(min = 3, message = "Name should have minimum 3 characters")
        String name,

        @Email
        @NotBlank(message = "Email is required")
        String email,

        @Valid
        Address address

) {
}
