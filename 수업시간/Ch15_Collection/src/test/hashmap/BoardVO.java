package test.hashmap;

public class BoardVO {
	private String register;
	private String email;
	private String passwd;
	private String subject;
	private String content;

	//
	public BoardVO(String register, String email, String passwd, String subject, String content) {
		super();
		this.register = register;
		this.email = email;
		this.passwd = passwd;
		this.subject = subject;
		this.content = content;
	}
	public boolean log(String register, String passwd) {
		if(this.register.equals(register) && this.passwd.equals(passwd)) return true;
		return false;
	}
	@Override
	public String toString() {
		return "작성자: " + register + ", 이메일: " + email + ", 제목: " + subject + ", 글 내용: " + content; 
	}
}
