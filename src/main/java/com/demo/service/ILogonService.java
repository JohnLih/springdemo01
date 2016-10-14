package com.demo.service;

import com.demo.entity.User;
import com.demo.exception.LogonException;

/**
 * Created by lihao on 16/9/27.
 */
public interface ILogonService {

    User logon(String name,String password) throws LogonException;
}
