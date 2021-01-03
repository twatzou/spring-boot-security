package com.itheima.security.springboot.dao

import com.itheima.security.springboot.model.UserDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate

class MyKtUserDao() {

    @Autowired
    private lateinit var jdbcTemplate: JdbcTemplate

    public fun getUserByUsername(username: String) {
        var sql1 = "SELECT id, username from t_user WHERE username = ?"
        var sql2 = "SELECT id,username,password,"
        //jdbcTemplate.query(sql1, Object[]{username}, BeanPropertyRowMapper<Object>(UserDto.class))
    }
}
