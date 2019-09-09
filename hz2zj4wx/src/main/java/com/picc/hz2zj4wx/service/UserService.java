package com.picc.hz2zj4wx.service;

import org.springframework.stereotype.Service;

import com.picc.hz2zj4wx.entity.User;
import com.picc.hz2zj4wx.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(int id){

        return userMapper.Sel(id);
    }
}
