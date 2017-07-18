package com.bjmh.cloud.system.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bjmh.cloud.system.user.entity.User;
import com.bjmh.cloud.system.user.mapper.UserMapper;
import com.bjmh.cloud.system.user.service.UserService;

@Service
public class UserServiceImpl implements UserService
{

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> queryAllUser()
    {
        return userMapper.queryAllUser();
    }

}
