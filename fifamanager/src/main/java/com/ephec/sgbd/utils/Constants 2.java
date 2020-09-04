package com.ephec.sgbd.utils;

public final class Constants {

    private Constants() {
    }

    // errors


    // db connection
    public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String JDBC_URL = "jdbc:mysql://localhost:3306/fifamanager?useSSL=false";
    public static final String JDBC_USER = "root";
    public static final String JDBC_PWD = "root";

    // persitence properties
    public static final String PROPERTIES_DRIVER = "javax.persistence.jdbc.driver";
    public static final String PROPERTIES_URL = "javax.persistence.jdbc.url";
    public static final String PROPERTIES_USER = "javax.persistence.jdbc.user";
    public static final String PROPERTIES_PWD = "javax.persistence.jdbc.password";


    public static final String DB_PU = "fifaPU";
    public static final int TIME_OUT = 1000;

    // SQL queries
    // CRUD USER
    public static final String USER_FINDALL = "select * from user";
    public static final String USER_FIND_BY_ID = "select id, name, pwd from user where id = ?";
    public static final String USER_ADD = "insert into user (name, pwd) VALUES (?,?)";
    public static final String USER_DELETE = "delete from user where id = ?";
    public static final String USER_UPDATE = "update user set name = ?, pwd = ? where id = ?";
}
