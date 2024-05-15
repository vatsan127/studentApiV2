package com.api.studentApiV2.config;

import com.api.studentApiV2.dao.StudentDao;
import com.api.studentApiV2.dao.StudentDaoImpl;
import com.api.studentApiV2.dao.StudentRowMapper;
import com.api.studentApiV2.service.StudentService;
import com.api.studentApiV2.service.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class BeanConfig {

    @Bean
    public StudentDao getStdDao(SingleStoreConfig config , StudentRowMapper rowMapper) {
        return new StudentDaoImpl(config,rowMapper);
    }

    @Bean
    public StudentService getStdService(StudentDao dao) {
        return new StudentServiceImpl(dao);
    }
}
