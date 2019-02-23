package com.xml.service;

import com.xml.model.User;
import com.xml.service.base.IBaseService;

public interface IUserService extends IBaseService<User> {
    //特有的方法
    public User login(String username,String password);
}
