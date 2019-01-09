package com.zhanghf;

import com.zhanghf.dao.BlogService;
import com.zhanghf.dao.UserDAO;
import com.zhanghf.entity.Blog;
import com.zhanghf.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestDao extends BaseJunitTest{
    @Autowired
    UserDAO userDAO;
    @Autowired
    BlogService blogService;

    @Test
    public void testWrapper(){
        User u1 = userDAO.find("hehe");
        User u2 = userDAO.login("hehe", "123");
        System.out.println(u1.getName().equals(u2.getName()));
    }

    @Test
    public void testInsert(){
        Blog blog = new Blog();
        blog.setId(2333);
        blog.setName("9944");
        blog.setUrl("http://localhost");
        blogService.save(blog);
    }
}
