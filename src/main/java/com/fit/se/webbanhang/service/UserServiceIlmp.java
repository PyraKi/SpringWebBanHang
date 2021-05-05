package com.fit.se.webbanhang.service;

import java.util.List;

import com.fit.se.webbanhang.entity.User;
import com.fit.se.webbanhang.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIlmp implements UserService{
    private final UserRepository userRepository;

    @Autowired
    public UserServiceIlmp(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public User getUser(int id) {
        return this.userRepository.findById(id).get();
    }

    @Override
    public void addUser(User user) {
        this.userRepository.save(user);
    }

    @Override
    public void removeUser(int id) {
        this.userRepository.deleteById(id);
    }
}
