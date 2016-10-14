package com.demo.entity;

import java.util.Date;
import java.util.List;

/**
 * Created by lihao on 16/9/25.
 */
public class User {

    private long userId;

    private String name;

    private String password;

    private Date createTime;

    private List<UserProperty> properties;

    public List<UserProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<UserProperty> properties) {
        this.properties = properties;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User {" +
                "userId=" + userId +
                ", name=" + name +
                ", password=" + password +
                ", createTime=" + createTime +
                ", properties=" + properties +
                "}";
    }
}
