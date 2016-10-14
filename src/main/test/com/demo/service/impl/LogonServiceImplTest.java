package com.demo.service.impl;

import com.demo.entity.User;
import com.demo.service.ILogonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by lihao on 16/9/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class LogonServiceImplTest {

    @Autowired
    private ILogonService logonService;

    @Test
    public void logon() throws Exception {
        User user = logonService.logon("John","password");
        assertNotEquals(user,null);
    }

}