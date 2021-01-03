package com.itheima.security.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Administrator
 * @version 1.0
 **/
//@RunWith(SpringRunner.class)
public class TestBCrypt {

    @Test
    public void testBCrypt(){

        //对密码进行加密
        String hashpw = BCrypt.hashpw("456", BCrypt.gensalt());
        System.out.println(hashpw);

        //校验密码
        boolean checkpw = BCrypt.checkpw("123", "$2a$10$aFsOFzujtPCnUCUKcozsHux0rQ/3faAHGFSVb9Y.B1ntpmEhjRtru");
        boolean checkpw2 = BCrypt.checkpw("123", "$2a$10$HuClcUqr/FSLmzSsp9SHqe7D51Keu1sAL7tUAAcb..FyILiLdFKYy");
        System.out.println(checkpw);
        System.out.println(checkpw2);
    }

    @Test
    public void testenc(){
        String hashPw = BCrypt.hashpw("123", BCrypt.gensalt());
        System.out.println("The hashed: " + hashPw);

        boolean check = BCrypt.checkpw("123", "$2a$10$Wo7Z22oT3gMtiEIbeKu4DOdZS5aR.MCjIime/dz8igLT8/6yuEaCa");
        System.out.println(check);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1"); list.add("2");
        Object[] str = list.toArray();
        System.out.println((String)str[1]);
    }

    public static void test(String... arguments) {
        for (int i = 0; i < arguments.length; i++) {
            System.out.println(arguments[i]);
        }
    }
}
