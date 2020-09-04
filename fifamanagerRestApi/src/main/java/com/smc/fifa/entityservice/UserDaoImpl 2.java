package com.smc.fifa.entityservice;

import com.smc.fifa.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static com.smc.fifa.utils.Constants.*;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    private final JdbcTemplate jdbcTemplate;

    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<User> findAll() {

        return jdbcTemplate.query(GET_ALL_USER, (resultSet, i) -> {
            Integer id = Integer.parseInt(resultSet.getString("id"));
            String login = resultSet.getString("login");
            String pwd = resultSet.getString("pwd");
            return new User(id, login, pwd);
        });
    }

    @Override
    public Optional<User> findById(Integer id) {
        User user = jdbcTemplate.queryForObject(GET_USER_BY_ID, new Object[]{id}, (resultSet, i) -> {
            Integer userId = Integer.parseInt(resultSet.getString("id"));
            String login = resultSet.getString("login");
            String pwd = resultSet.getString("pwd");
            return new User(userId, login, pwd);
        });
        return Optional.ofNullable(user);
    }

    @Override
    public void add(Integer id, User user) {
        jdbcTemplate.update(ADD_USER,
                user.getLogin(),
                user.getPwd());
    }

    @Override
    public void add(User user) {
        jdbcTemplate.update(ADD_USER,
                user.getLogin(),
                user.getPwd());
    }

    @Override
    public boolean delete(Integer id) {
        return jdbcTemplate.update(DELETE_USER, id) > 0;
    }

    @Override
    public Integer findByUsername(String login, String pwd) {
            List <User> userList = jdbcTemplate.query(CHECK_USER_LOGIN, (resultSet, i) -> {
            String loginDB = resultSet.getString("login");
            String pwdDB = resultSet.getString("pwd");
                return new User(loginDB, pwdDB);
            });
        if (userList.size()!= 1){
            return 0;
        }
        return 1;
    }

    @Override
    public void update(Integer id, User update) {
        this.jdbcTemplate.update(UPDATE_USER,
                update.getLogin(), update.getPwd(), id);
    }

}