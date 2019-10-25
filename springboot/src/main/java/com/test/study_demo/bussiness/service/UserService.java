package com.test.study_demo.bussiness.service;

import com.test.study_demo.bussiness.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> selectAllUser();

    /**
     * 动态的根据查询条件来查询用户
     * @param user
     * @return
     */
    List<User> selectByUser(User user);

    /**
     * 新增用户
     * @param user
     */
    void insert(User user);

    /**
     * 动态的根据用户信息插入到表中
     * @param user
     */
    void insertByUser(User user);

    /**
     * 批量插入用户
     * @param users
     */
    void insertBatch(List<User> users);

    /**
     * 更新用户信息  根据用户id更新用户信息 为空的字段不做更新
     * @param user
     */
    void updateByUser(User user);

    /**
     * 根据用户id删除用户
     * @param user
     */
    void deleteByUserId(User user);
}
