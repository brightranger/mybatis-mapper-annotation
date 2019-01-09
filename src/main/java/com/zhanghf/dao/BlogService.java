package com.zhanghf.dao;

import com.zhanghf.entity.Blog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BlogService {

    @Insert("insert into t_blog (id,name,url) values (#{blog.id},#{blog.name},#{blog.url})")
    void save(@Param("blog") Blog blog);

    @Update("update t_blog set name=#blog.name,url=#blog.url where id=#blog.id")
    void update(@Param("blog") Blog blog);

}
