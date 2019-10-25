package com.test.study_demo.serviceTest;

import com.test.study_demo.StudyDemoApplicationTests;
import com.test.study_demo.bussiness.entity.User;
import com.test.study_demo.bussiness.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserServiceImplTest extends StudyDemoApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void selectAllUser() {
        List<User> users = userService.selectAllUser();
        Assert.assertNotNull(users);
    }

    @Test
    public void selectByUser() {
        User user= new User();
        user.setName("tianya");
        List<User> users = userService.selectByUser(user);
        Assert.assertNotNull(users);
    }

    @Test
    public void insert() {
        User user = new User();
        user.setName("天涯");
        user.setSex("男");
        user.setSchool("第三中学");
        userService.insert(user);
    }

    @Test
    public void insertByUser() {
        User user = new User();
        user.setName("春雨");
        userService.insertByUser(user);
    }

    @Test
    public void insertBatch() {
        List<User> lists=new ArrayList<>();
        lists.add(new User("111","2","第四中学"));
        lists.add(new User("222","0","第五中学"));
        userService.insertBatch(lists);
    }

    @Test
    public void updateByUser() {
        User user = new User();
        user.setId(1);
        user.setName("绿萝");
        userService.updateByUser(user);
    }

    @Test
    public void deleteByUserId() {
        User user = new User();
        user.setId(2);
        userService.deleteByUserId(user);
    }
}