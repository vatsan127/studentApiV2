package com.api.studentApiV2.service;

import com.api.studentApiV2.model.Student;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface StudentService {
    Student create(@Valid @RequestBody Student student);

    List<Student> getAllStd();

    Student getStdById(@PathVariable Long id);

    Student deleteStd(@PathVariable Long id);

}
