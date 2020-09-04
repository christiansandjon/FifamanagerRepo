package com.ephec.sgbd.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDeConnection {
    public static final String driver = "com.mysql.jdbc.Driver";
    public static final String url = "jdbc:mysql://localhost:3306/fifarestapi?serverTimezone=UTC";
    public static final String user = "root";
    public static final String pwd = "root";
    public static void main(String... args){

        Connection conn = null;

        try {

            conn = DriverManager.getConnection(url,user,pwd);
                 System.out.println("connexion reussie");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (conn!=null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
