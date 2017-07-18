package com.bjmh.cloud.system.login.controller;

import com.bjmh.cloud.system.user.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/7/13 0013.
 */
@Controller
public class LoginController
{
    @RequestMapping(value = "access", method = RequestMethod.POST)
    public String login (@RequestBody User user)
    {
        System.out.println(user.getEmail() + "-->" + user.getPassword());
        return "success";
    }
}
