package com.itheima.security.springboot.service;

import com.itheima.security.springboot.dao.MyUserDao;
import com.itheima.security.springboot.model.PermissionDto;
import com.itheima.security.springboot.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private MyUserDao myUserDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("begen my service");
        //UserDetails build = User.withUsername("zou").password("123").authorities("p1").build();
        UserDto userDto = myUserDao.getUserByUsername(username);
        if (userDto == null)
            return null;

        List<String> permissions = myUserDao.findPermissionsByUserId(userDto.getId());
        String[] permissionArray = new String[permissions.size()];
        permissions.toArray(permissionArray);

        UserDetails userDetails = User.withUsername(username)
                .password(userDto.getPassword())
                .authorities(permissionArray)
                .build();
        return userDetails;
    }
}
