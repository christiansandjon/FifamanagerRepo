package com.smc.fifa.model;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class User implements Serializable {

    private Integer id;
    @NotBlank
    private String login;
    @NotBlank
    private String pwd;

    public User() {
    }

    public User(@NotBlank String login, @NotBlank String pwd) {
        this.login = login;
        this.pwd = pwd;
    }

    public User(Integer id, @NotBlank String login, @NotBlank String pwd) {
        this.id = id;
        this.login = login;
        this.pwd = pwd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}