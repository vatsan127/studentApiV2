package com.api.studentApiV2.dao;

import com.api.studentApiV2.model.Student;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class StudentRowMapper implements RowMapper<Student> {

    /* Map Entity to Student object*/
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student(rs.getLong("id"),
                rs.getString("name"),
                rs.getString("email"));
        return student;
    }

}
