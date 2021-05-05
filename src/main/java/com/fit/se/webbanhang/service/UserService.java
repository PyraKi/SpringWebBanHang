package com.fit.se.webbanhang.service;

import java.util.List;

import com.fit.se.webbanhang.entity.User;

public interface UserService {
    public List<User> getUsers();
    public User getUser(int id);
    public void addUser(User user);
    public void removeUser(int id);
}
