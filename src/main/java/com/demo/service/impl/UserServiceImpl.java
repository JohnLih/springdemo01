package com.demo.service.impl;

import com.demo.dao.IUserDao;
import com.demo.dao.IUserPropertyDao;
import com.demo.entity.User;
import com.demo.entity.UserProperty;
import com.demo.exception.UserException;
import com.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lihao on 16/9/28.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Autowired
    private IUserPropertyDao userPropertyDao;

    public List<User> list(int offset, int limit) {
        return userDao.queryAll(offset,limit);
    }

    public User getUser(long id) {
        return userDao.queryById(id);
    }

    @Transactional
    public void add(User user) throws UserException {
        int ret = userDao.insert(user);
        if (ret <= 0){
            throw new UserException("insert user error.");
        }
        List<UserProperty> properties = user.getProperties();
        if (properties != null && properties.size() > 0){
            for (UserProperty property :
                    properties) {
                ret = userPropertyDao.insert(property);
                if (ret <= 0){
                    throw new UserException("insert user property error.");
                }
            }
        }
    }

    @Transactional
    public void delete(long id) throws UserException {
        int ret = userPropertyDao.deleteByUserId(id);
        if (ret <= 0){
            throw new UserException("delete user property error.");
        }
        ret = userDao.delete(id);
        if (ret <= 0){
            throw new UserException("delete user error.");
        }
    }
}
