package com.xiaoqiao.entity;

import com.xiaoqiao.util.Page;

import java.io.Serializable;

public class User extends Page implements Serializable {

    private static final long serialVersionUID = -2243309654186500408L;

    private int userId;

    private String userName;

    private String password;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
