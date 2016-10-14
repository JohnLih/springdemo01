package com.demo.dao;

import com.demo.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lihao on 16/9/25.
 */
public interface IUserDao {

    int insert(User user);

    List<User> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    User queryById(long userId);

    User queryByName(String name);

    int delete(long userId);
}
