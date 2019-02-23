package com.xml.controller;

import com.xml.model.User;
import com.xml.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    public String login(){
        System.out.println("登陆...");
        return "Default";
    }

    @RequestMapping("find")
    public String find(Integer id){
        System.out.println("查找...");
        User user = userService.findById(id);
        System.out.println(user);
        return null;
    }

    @RequestMapping("manage")
    public String manage(){
        return "User/Manage";
    }

    @RequestMapping("info")
    public String info(){
        return "User/Info";
    }

    @RequestMapping("edit")
    public String edit(){
        return "User/Edit";
    }
}
