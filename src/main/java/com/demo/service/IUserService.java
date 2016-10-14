package com.demo.service;

import com.demo.entity.User;
import com.demo.exception.UserException;

import java.util.List;

/**
 * Created by lihao on 16/9/28.
 */
public interface IUserService {

    List<User> list(int offset,int limit);

    User getUser(long id);

    void add(User user) throws UserException;

    void delete(long id) throws UserException;

}
