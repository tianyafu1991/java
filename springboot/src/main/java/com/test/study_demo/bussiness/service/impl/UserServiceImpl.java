package com.test.study_demo.bussiness.service.impl;

import com.test.study_demo.bussiness.entity.User;
import com.test.study_demo.bussiness.mapper.UserMapper;
import com.test.study_demo.bussiness.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所有用户
     *
     * @return
     */
    @Override
    public List<User> selectAllUser() {
        return userMapper.select();
    }

    /**
     * 动态的根据查询条件来查询用户
     *
     * @param user
     * @return
     */
    @Override
    public List<User> selectByUser(User user) {
        return userMapper.selectByUser(user);
    }

    /**
     * 新增用户
     *
     * @param user
     */
    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    /**
     * 动态的根据用户信息插入到表中
     *
     * @param user
     */
    @Override
    public void insertByUser(User user) {
        userMapper.insertByUser(user);
    }

    /**
     * 批量插入用户
     *
     * @param users
     */
    @Override
    public void insertBatch(List<User> users) {
        userMapper.insertList(users);
    }

    /**
     * 更新用户信息  根据用户id更新用户信息 为空的字段不做更新
     *
     * @param user
     */
    @Override
    public void updateByUser(User user) {
        if(null==user.getId()){
            throw new RuntimeException("用户id不能为空");
        }
        userMapper.update(user);
    }

    /**
     * 根据用户id删除用户
     *
     * @param user
     */
    @Override
    public void deleteByUserId(User user) {
        if(null==user.getId()){
            throw new RuntimeException("用户id不能为空");
        }
        userMapper.delete(user);
    }
}
