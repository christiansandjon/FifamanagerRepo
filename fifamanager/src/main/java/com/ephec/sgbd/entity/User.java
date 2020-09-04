package com.ephec.sgbd.entity;

import javax.persistence.*;
import java.io.Serializable;

import static com.ephec.sgbd.utils.Constants.*;

@Entity
@Table(name = "user")
@NamedNativeQueries({
        @NamedNativeQuery(name = User.USER_FINDALL, query = USER_FINDALL),
        @NamedNativeQuery(name = User.USER_FIND_BY_ID, query = USER_FIND_BY_ID),
        @NamedNativeQuery(name = User.USER_ADD, query = USER_ADD),
        @NamedNativeQuery(name = User.USER_UPDATE, query = USER_UPDATE),
        @NamedNativeQuery(name = User.USER_DELETE, query = USER_DELETE)
        })
public class User implements Serializable {

    public static final String USER_FINDALL = "User.findAll";
    public static final String USER_FIND_BY_ID = "User.findById";
    public static final String USER_ADD = "User.add";
    public static final String USER_UPDATE = "User.update";
    public static final String USER_DELETE = "User.delete";

    // fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String login;

    @Column(name = "pwd")
    private String pwd;

    // constructors

    public User() {
    }

    public User(Integer id, String login, String pwd) {
        this.id = id;
        this.login = login;
        this.pwd = pwd;
    }

    public Integer getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLogin(String name) {
        this.login = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    // toString

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
