package com.ysq.springboot_01_new.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // 定义为控制类
@RequestMapping("/books")  // 定义访问路径
public class BookController {
    @Value("${likes[0]}")
    private String lesson;


    @GetMapping("/{id}") //
    public String getById(@PathVariable Integer id) {
        System.out.println(lesson);
        System.out.println("id == > " + id);
        return "hello , spring boot";
    }
}
