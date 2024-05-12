package com.api.studentApiV2.controller;

import com.api.studentApiV2.model.Student;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/student")
public class StudentController {

    @GetMapping("/create")
    public void create(@Valid @RequestBody Student student){

    }
}
