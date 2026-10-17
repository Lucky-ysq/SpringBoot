package com.ysq.springboot_04_mybatis;

import com.ysq.springboot_04_mybatis.dao.UserDao;
import com.ysq.springboot_04_mybatis.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04MybatisApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
        User user = userDao.getUserById(1);
        System.out.println(user);
    }

}
