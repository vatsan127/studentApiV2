package com.api.studentApiV2.service;

import com.api.studentApiV2.dao.StudentDao;
import com.api.studentApiV2.model.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao dao;

    public StudentServiceImpl(StudentDao dao) {
        this.dao = dao;
    }

    @Override
    public Student create(Student student) {
        return null;
    }

    @Override
    public List<Student> getAllStd() {
        return null;
    }

    @Override
    public Student getStdById(Long id) {
        return null;
    }

    @Override
    public Student deleteStd(Long id) {
        return null;
    }
}
