package com.ysq.springboot_03_junit.Service.impl;

import com.ysq.springboot_03_junit.Service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("已经保存成功~");
    }
}
