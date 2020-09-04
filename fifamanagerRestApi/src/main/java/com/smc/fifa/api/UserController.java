package com.smc.fifa.api;

import com.smc.fifa.model.User;
import com.smc.fifa.taskservice.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    private final UserServiceImpl userServiceImpl;

    @Autowired
    public UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @PostMapping
    public void add(@Valid @NotNull @RequestBody User user) {
        userServiceImpl.addUser(user);
    }

    @GetMapping
    public List<User> findAll() {
        return userServiceImpl.findAll();
    }

    @GetMapping(path = "{id}")
    public Optional<User> findById(@NotNull @PathVariable("id") Integer id) {
        return userServiceImpl.findById(id);
    }

    @DeleteMapping(path = "{id}")
    public void delete(@NotNull @PathVariable("id") Integer id) {
        userServiceImpl.delete(id);
    }

    @PutMapping(path = "{id}")
    public void update(@NotNull @PathVariable("id") Integer id, @Valid @NotNull @RequestBody User userToUpdate) {
        userServiceImpl.update(id, userToUpdate);
    }

    @GetMapping("/login/{login}/{pwd}")
    public Integer getLogin(@PathVariable String login,@PathVariable String pwd ) {
        return userServiceImpl.findByUsername(login, pwd);
    }

}
