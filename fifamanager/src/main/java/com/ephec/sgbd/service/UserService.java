package com.ephec.sgbd.service;

import com.ephec.sgbd.entity.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> findAll();

    User findById(Integer id);

    void update(Integer id, User user);

    void delete(Integer id);
}