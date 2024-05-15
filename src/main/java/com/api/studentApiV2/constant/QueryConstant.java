package com.api.studentApiV2.constant;

public class QueryConstant {
    public static final String SELECT_STUDENT = "SELECT * FROM student_info ;";
    public static final String SELECT_STUDENT_BY_ID = "SELECT * FROM student_info WHERE id = ?;";
    public static final String INSERT_STUDENT = "INSERT INTO student_info (name, age, degree, branch) VALUES (?,?,?,?) ;";
    public static final String DELETE_STUDENT = "DELETE FROM student_info WHERE id = ?";

}
