package com.smc.fifa.taskservice;

import com.smc.fifa.entityservice.UserDao;
import com.smc.fifa.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(@Qualifier("userDao") UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        userDao.add(user);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public Optional<User> findById(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public void update(Integer id, User newUser) {
        userDao.update(id, newUser);
    }

    @Override
    public void delete(Integer id) {
        userDao.delete(id);
    }

    @Override
    public     Integer findByUsername(String login, String pwd) {
        return userDao.findByUsername(login,pwd);
    }
}
