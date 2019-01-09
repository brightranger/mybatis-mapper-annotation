package com.zhanghf.dao;

import com.zhanghf.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDAO {

    @Select("select * from user where name = #{name}")
    User find(String name);

    @Select("select * from user where name = #{name} and pwd = #{pwd}")
    User login(@Param("name") String name, @Param("pwd") String pwd);

}