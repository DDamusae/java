package com.spring.changepw.command;

//비밀번호 변경을 위해서 사용되는 Command 객체
public class ChangePwdCommand {
	private String currentPassword;
	private String newPassword;
	
	
	public String getCurrentPassword() {
		return currentPassword;
	}
	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
	
}
