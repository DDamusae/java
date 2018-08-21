package com.spring.login.command;

public class LoginCommand {
	private String email;
	private String password;
	private Boolean rememberEmail;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getRememberEmail() {
		return rememberEmail;
	}
	public void setRememberEmail(Boolean rememberEmail) {
		this.rememberEmail = rememberEmail;
	}
	
	public boolean isRememberEmail() {
		return rememberEmail;
	}
	
}
