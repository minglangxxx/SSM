package com.xml.service.impl;

import com.xml.model.User;
import com.xml.service.IUserService;
import com.xml.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional//事务管理
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {
    @Override
    public User login(String username, String password) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public User findByUUID(String uuid) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByUUID(String uuid) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void create(User user) {

    }

}
