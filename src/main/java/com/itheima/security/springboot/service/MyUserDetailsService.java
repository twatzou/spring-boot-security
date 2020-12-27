package com.itheima.security.springboot.service;

import com.itheima.security.springboot.dao.MyUserDao;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.sql.SQLOutput;

public class MyUserDetailsService implements UserDetailsService {

    private MyUserDao myUserDao;

    private MyUserDetailsService(){
        myUserDao = new MyUserDao();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("begen my service");
        UserDetails build = User.withUsername("zou").password("123").authorities("p1").build();
        return build;
    }
}
