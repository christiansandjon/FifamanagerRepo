package com.ephec.sgbd.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@Entity
@Table(name="Admin")

public class Admin implements Serializable{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="login")
	private String login;
	
	@Column(name="password")
	private String password;
	private static final long
	serialVersionUID = 1L;


	
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin() {
		return this.login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/*
	public void save(String login,String password) {

		try{  
			Class.forName(connect);
			Connection con=DriverManager.getConnection(  
			udbc,user,pass);
			
			Statement stmt=con.createStatement();  
			String sql = "INSERT INTO admin(id,login,password) VALUES (NULL,'"+login+"','"+password+"')";
			stmt.executeUpdate(sql);  
			
			}catch(Exception e){ System.out.println(e);
		
			} 		
	}



	public boolean isUser() {
		
		boolean test = false;
		
		try{  
			Class.forName(connect);
			Connection con=DriverManager.getConnection(udbc,user,pass);
			 
			Statement stmt=con.createStatement();  
			String sql = "SELECT * FROM admin";
			ResultSet resultat = stmt.executeQuery(sql);  
			while(resultat.next()) {
				String user = resultat.getString("login");
				String pass = resultat.getString("password");
				
				if((user.equals(this.login))&&(pass.equals(this.password))) {
					test = true;
				}
				
			}
			
			}catch(Exception e){ System.out.println(e);
		
			} 			
		return test;
	}
	
	public String getPassword(int id) {
		String password="";
		try{  
			Class.forName(connect);
			Connection con=DriverManager.getConnection(udbc,user,pass);
			 
			Statement stmt=con.createStatement();  
			String sql = "SELECT * FROM admin WHERE id ="+id+"";
			System.out.println(sql);
			ResultSet resultat = stmt.executeQuery(sql);  
			while(resultat.next()) {
				String user = resultat.getString("login");
				 password = resultat.getString("password");
			}
			
			}catch(Exception e){ System.out.println(e);
		
			} 	
		
		return password;
		
	}
	
	public void update(int id,String password) {
		try{  
			Class.forName(connect);
			Connection con=DriverManager.getConnection(udbc,user,pass);
			 
			Statement stmt=con.createStatement();  
			String sql = "UPDATE admin SET password = '"+password+"' WHERE id="+id+"";
			stmt.executeUpdate(sql);  
			
			}catch(Exception e){ System.out.println(e);
		
			} 				
		
	}


		 */
}
