package com.api.studentApiV2.dao;

import com.api.studentApiV2.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public List<Student> findAllStd() {
        return null;
    }

    @Override
    public Student deleteStd(Long id) {
        return null;
    }

    @Override
    public Student save(Student student) {
        return null;
    }
}
