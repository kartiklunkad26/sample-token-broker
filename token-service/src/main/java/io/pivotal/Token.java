package io.pivotal;

public class Token {
	
	private Integer id;
	private String user;
	private String password;
	
	public Token() {
	}
	

	public Token(Integer id) {
		this.id = id;
		//Need to generate these user and password
		this.user	 = "abc";
		this.password = "bcdefgh";
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
