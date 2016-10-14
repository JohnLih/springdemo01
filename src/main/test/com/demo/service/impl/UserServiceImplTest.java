package com.demo.service.impl;

import com.demo.entity.User;
import com.demo.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lihao on 16/9/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class UserServiceImplTest {

    @Autowired
    private IUserService userService;

    @Test
    public void list() throws Exception {
        List<User> list = userService.list(0,10);
        assertTrue(list.size() >= 0);
    }

    @Test
    public void getUser() throws Exception {

    }

    @Test
    public void add() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

}