package com.ysq.springboot_03_junit;

import com.ysq.springboot_03_junit.Service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot03JunitApplicationTests {

    @Autowired
    private BookService book;

    @Test
    void contextLoads() {
        book.save();
    }

}
