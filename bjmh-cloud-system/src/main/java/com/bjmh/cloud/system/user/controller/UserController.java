package com.bjmh.cloud.system.user.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bjmh.cloud.system.user.entity.User;
import com.bjmh.cloud.system.user.service.UserService;

@Controller
@RequestMapping("user")
public class UserController
{

    @Resource
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<User> listUser()
    {
        return userService.queryAllUser();
    }

}
