package com.smc.fifa.taskservice;

import com.smc.fifa.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void addUser(User user);

    List<User> findAll();

    Optional<User> findById(Integer id);

    void update(Integer id, User user);

    void delete(Integer id);

    Integer findByUsername(String login, String pwd);
}