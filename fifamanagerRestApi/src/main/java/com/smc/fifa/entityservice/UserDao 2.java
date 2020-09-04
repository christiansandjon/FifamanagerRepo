package com.smc.fifa.entityservice;

import com.smc.fifa.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {

    void add(User user);

    void add(Integer id, User user);

    List<User> findAll();

    Optional<User> findById(Integer id);

    void update(Integer id, User user);

    boolean delete(Integer id);

    Integer findByUsername(String login, String pwd);
}
