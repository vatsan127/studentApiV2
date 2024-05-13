package com.api.studentApiV2.dao;

import com.api.studentApiV2.model.Student;

import java.util.List;

public interface StudentDao {
    Student findById(Long id);

    List<Student> findAllStd();

    Student deleteStd(Long id);

    Student save(Student student);
}
