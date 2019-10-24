package com.test.study_demo.bussiness.mapper;

import com.test.study_demo.bussiness.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     * 查询所有用户
     * @return
     */
    List<User> select();



    /**
     * 新增用户
     * @param user
     */
    void insert(@Param("user") User user);

    /**
     * 更新用户信息  可以是动态更新
     * @param user
     */
    void update(@Param("user") User user);

    /**
     *根据用户 id 删除用户
     * @param user
     */
    void delete(@Param("user")User user);

    /**
     * 动态的根据查询条件来查询用户
     * @param user
     * @return
     */
    List<User> selectByUser(@Param("user") User user);

    /**
     * 动态的根据用户信息插入到表中
     * @param user
     */
    void insertByUser(@Param("user")User user);

    /**
     * 批量插入
     * @param users
     */
    void insertList(@Param("users") List<User> users);




}
