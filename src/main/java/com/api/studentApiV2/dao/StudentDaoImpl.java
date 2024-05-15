package com.api.studentApiV2.dao;

import com.api.studentApiV2.config.SingleStoreConfig;
import com.api.studentApiV2.constant.QueryConstant;
import com.api.studentApiV2.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    //    private JdbcTemplate jdbcTemplate;
    private SingleStoreConfig config;
    private StudentRowMapper rowMapper;
    private final Logger log = LoggerFactory.getLogger(StudentDaoImpl.class);

    public StudentDaoImpl() {

    }

    public StudentDaoImpl(SingleStoreConfig config, StudentRowMapper rowMapper) {
        this.config = config;
        this.rowMapper = rowMapper;
    }

    @Override
    public Student save(Student student) {
        Student saved = null;
        try (Connection conn = config.getDataSource().getConnection();
             PreparedStatement ps = conn.prepareStatement(QueryConstant.INSERT_STUDENT, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, student.name());
            ps.setString(2, student.email());
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                ResultSet generatedKeys = ps.getGeneratedKeys();
                if (generatedKeys.next()) {
                    long id = generatedKeys.getLong(1);
                    saved = student.setId(id);
                    log.info("StudentDaoImpl :: save :: saved :: {}", saved);
                }
            }
        } catch (SQLException e) {
            log.error("SQLException occurred while Inserting Student Data :: ", e);
        }
        return saved;
    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public List<Student> findAllStd() {
        List<Student> studentList = new ArrayList<>();
        try (Connection conn = config.getDataSource().getConnection();
             PreparedStatement ps = conn.prepareStatement(QueryConstant.SELECT_STUDENT);
             ResultSet resultSet = ps.executeQuery()) {
            while (resultSet.next()) {
                Student student = rowMapper.mapRow(resultSet, resultSet.getRow());
                studentList.add(student);
            }
        } catch (SQLException e) {
            log.error("SQLException occurred while retrieving students :: ", e);
        }
        return studentList;
    }

    @Override
    public Student deleteStd(Long id) {
        return null;
    }

}
