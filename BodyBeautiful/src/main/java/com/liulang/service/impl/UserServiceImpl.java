package com.liulang.service.impl;

import com.liulang.dao.UserMapper;
import com.liulang.model.User;
import com.liulang.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Resource(name="userMapper")
    private UserMapper userMapper;

    /**
     * 添加一个用户，
     * 添加之前先判断该用户是否已注册
     * @param user
     */
    public String addUser(User user) {

        if(userMapper.selectByOpenid(user.getOpenid())==null){
            try {
                user.setRegistertTime(new Date());
                userMapper.insert(user);

            }catch (Exception e){
                e.getStackTrace();
                return "add user fail";
            }

        }
        return "add user success";
    }
}
