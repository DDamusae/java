package member.model;

import java.util.Date;

public class Member {
	private String id;
	private String name;
	private String password;
	private Date regDate;
	public Member(String id, String name, String password, Date regDate) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.regDate = regDate;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public Date getRegDate() {
		return regDate;
	}
	
	//패스워드 확인용 메소드
	public boolean matchPassword(String pwd) {
		return password.equals(pwd);
	}
	
	//패스워드 변경시 사용하는 메소드
	public void changePassword(String newPwd) {
		this.password = newPwd;
	}
	
}
