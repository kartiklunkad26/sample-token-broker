package io.pivotal;

public class Token {
	private Long token;
	private String pan;
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
	public Token() {
	}
	@Override
	public String toString() {
		return "Token [token=" + token + ", pan=" + pan + "]";
	}
	
	

}
