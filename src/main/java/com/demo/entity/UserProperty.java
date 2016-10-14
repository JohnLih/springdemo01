package com.demo.entity;

/**
 * Created by lihao on 16/9/25.
 */
public class UserProperty {

    private long userId;

    private String name;

    private String value;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "UserProperty {" +
                "userId=" + userId +
                ", name=" + name +
                ", value=" + value +
                "}";
    }
}
