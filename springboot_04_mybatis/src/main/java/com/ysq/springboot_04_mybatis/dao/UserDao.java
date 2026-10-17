package com.ysq.springboot_04_mybatis.dao;

import com.ysq.springboot_04_mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Select("select * from user where id = #{id}")
    User getUserById(int id);
}
