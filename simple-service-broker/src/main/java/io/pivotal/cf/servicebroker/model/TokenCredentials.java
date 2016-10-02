package io.pivotal.cf.servicebroker.model;

public class TokenCredentials {
	private Integer id;
	private String user;
	private String password;
	
	public TokenCredentials() {
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
