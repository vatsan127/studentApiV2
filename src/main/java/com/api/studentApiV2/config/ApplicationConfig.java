package com.api.studentApiV2.config;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class ApplicationConfig {
    private String mail = "@gmail.com";
}
