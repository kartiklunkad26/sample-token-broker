package io.pivotal;

public class TokenService {
	private Long token;
	private String pan;
	
	public TokenService() {
	}
	

	public TokenService(Long token, String pan) {
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
