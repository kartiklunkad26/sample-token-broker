package io.pivotal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Token {
	
	@Id
	private Integer id;
	private String user;
	private String password;
	
	public Token() {
	}
	

	public Token(Integer id) {
		this.id = id;
		this.user	 = "user" + id.toString();
		this.password = "keepitsimple";
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


}
