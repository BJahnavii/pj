package org.infinite.pojo;

import java.sql.Timestamp;
import java.util.Date;

//pojo class also known as persistence
public class Login {
	private int  ids;
	private String username;
	private String password;
	private java.sql.Timestamp logintmp;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public java.sql.Timestamp getLogintmp() {
		return logintmp;
	}
	public void setLogintmp(java.sql.Timestamp logintmp) {
		this.logintmp = logintmp;
	}
	public Login()
	{
		
	}
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
