package com.ephec.sgbd.dao;

import com.ephec.sgbd.entity.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    List<User> findAll();

    User findById(Integer id);

    void update(Integer id, User user);

    void delete(Integer id);
}
