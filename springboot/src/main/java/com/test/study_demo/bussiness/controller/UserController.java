package com.test.study_demo.bussiness.controller;

import com.test.study_demo.bussiness.entity.User;
import com.test.study_demo.bussiness.service.UserService;
import com.test.study_demo.frame.response.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/selectAll")
    public CommonResponse selectAllUser(){
        return CommonResponse.success(userService.selectAllUser());
    }

    @RequestMapping(value = "/selectByUser")
    public CommonResponse selectByUser(User user){
        return CommonResponse.success(userService.selectByUser(user));
    }

}
