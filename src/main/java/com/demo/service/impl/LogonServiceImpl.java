package com.demo.service.impl;

import com.demo.dao.IUserDao;
import com.demo.entity.User;
import com.demo.exception.LogonException;
import com.demo.service.ILogonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lihao on 16/9/28.
 */
@Service
public class LogonServiceImpl implements ILogonService{

    @Autowired
    private IUserDao userDao;

    public User logon(String name, String password) throws LogonException {
        User user = userDao.queryByName(name);
        if (user == null || !user.getPassword().equals(password)){
            throw new LogonException("User name or password is error.");
        }
        return user;
    }
}
