package com.api.studentApiV2.controller;

import com.api.studentApiV2.model.Student;
import com.api.studentApiV2.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class StudentController {
    private StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/create")
    public ResponseEntity<Student> create(@Valid @RequestBody Student std) {
        Student savedStd = studentService.create(std);
        URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path("/id").buildAndExpand(savedStd.id()).toUri();
        return ResponseEntity.created(location).body(savedStd);
    }

    @GetMapping("/")
    public List<Student> getAllStd() {
        return studentService.getAllStd();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStdById(@PathVariable Long id) {
        Student student = studentService.getStdById(id);
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteStd(@PathVariable Long id) {
        Student student = studentService.deleteStd(id);
        return ResponseEntity.ok(String.format("DATA REMOVED " + "\nName: %s" + "\nid: %s", student.name(), String.valueOf(student.id())));
    }

}
