package com.api.studentApiV2.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record Address(
        @NotBlank
        String no,
        @NotBlank
        String street,
        @NotBlank
        String area,
        @NotBlank
        String town,
        @Valid
        @Size(min = 5, message = "Invalid Pin-code!!! please enter a valid Pin-code ")
        String pincode) {
}
