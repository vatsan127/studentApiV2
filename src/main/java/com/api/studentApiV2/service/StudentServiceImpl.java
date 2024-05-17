package com.api.studentApiV2.service;

import com.api.studentApiV2.dao.StudentDao;
import com.api.studentApiV2.model.Student;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class StudentServiceImpl implements StudentService {

    private StudentDao dao;

    public StudentServiceImpl(StudentDao dao) {
        this.dao = dao;
    }

    @Override
    public Student create(Student student) {
        return dao.save(student);
    }

    @Override
    public List<Student> getAllStd() {
        return dao.findAllStd();
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
