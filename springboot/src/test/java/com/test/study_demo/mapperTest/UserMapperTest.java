package com.test.study_demo.mapperTest;

import com.test.study_demo.StudyDemoApplicationTests;
import com.test.study_demo.bussiness.entity.User;
import com.test.study_demo.bussiness.mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


public class UserMapperTest extends StudyDemoApplicationTests {


    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect(){

        List<User> select = userMapper.select();
        System.out.println(select.size());
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setName("wangchunyu");
        user.setSex("0");
        user.setSchool("第一中学");
        userMapper.insert(user);
    }

    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(1);
        user.setName("张三");
        userMapper.update(user);
    }

    @Test
    public void testSelectByUser(){
        User user = new User();
        user.setSex("1");
        List<User> users = userMapper.selectByUser(user);
        System.out.println(users.size());
    }

    @Test
    public void testDelete(){
        User user = new User();
        user.setId(1);
        userMapper.delete(user);
    }

    @Test
    public void testInsertList(){
        User user1 = new User();
        user1.setName("tianya");
        user1.setSex("1");
        user1.setSchool("第一中学");

        User user2 = new User();
        user2.setName("chunyu");
        user2.setSex("0");
        user2.setSchool("第一中学");
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        userMapper.insertList(users);
    }

    @Test
    public void testInsertByUser(){
        User user = new User();
        user.setSchool("第一中学");
        user.setName("静静");
        userMapper.insertByUser(user);
    }

}