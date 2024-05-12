package com.api.studentApiV2.model;

import jakarta.validation.Valid;

public record Address(String no, String street, String area, String town, @Valid String pincode) {
}
