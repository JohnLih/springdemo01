package com.demo.dao;

import com.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * Created by lihao on 16/9/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class IUserDaoTest {

    @Autowired
    private IUserDao userDao;

    @Test
    public void insert() throws Exception {

        User user = new User();
        user.setName("Tom");
        user.setPassword("password");

        userDao.insert(user);
    }

    @Test
    public void queryAll() throws Exception {
        List<User> users = userDao.queryAll(0,10);
        for (User user : users){
            System.out.println(user);
        }
    }

    @Test
    public void queryById() throws Exception {

        User user = userDao.queryById(1000);
        System.out.println(user);
    }

    @Test
    public void delete() throws Exception {

        int ret = userDao.delete(1002);
        System.out.println(ret);
    }

}