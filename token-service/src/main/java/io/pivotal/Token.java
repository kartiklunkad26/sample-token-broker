package io.pivotal;

public class Token {
	private Long token;
	private String pan;
	
	public Token() {
	}
	

	public Token(Long token, String pan) {
		this.token = token;
		this.pan = pan;
	}


	public Long getToken() {
		return token;
	}

	public void setToken(Long token) {
		this.token = token;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}
	

}
