package com.demo.dao;

import com.demo.entity.UserProperty;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by lihao on 16/9/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class IUserPropertyDaoTest {

    @Autowired
    private IUserPropertyDao userPropertyDao;

    @Test
    public void insert() throws Exception {

        UserProperty property = new UserProperty();
        property.setUserId(1001);
        property.setName("email");
        property.setValue("test@123.com");
        int ret = userPropertyDao.insert(property);
        assertEquals(1,ret);
    }

    @Test
    public void deleteByUserId() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

}