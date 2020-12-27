package com.itheima.security.springboot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class MyUserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

}
