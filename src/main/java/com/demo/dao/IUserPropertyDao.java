package com.demo.dao;

import com.demo.entity.UserProperty;
import org.apache.ibatis.annotations.Param;

/**
 * Created by lihao on 16/9/25.
 */
public interface IUserPropertyDao {

    int insert(UserProperty property);

    int deleteByUserId(long userId);

    int delete(@Param("userId") long userId,@Param("name") String name);

}
