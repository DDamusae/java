package javalogintest;

public class User {
	private String id;
	private String passwd;
	private String name;
	private int age;
	private String addr;
	private String email;
	
	public User(String id, String passwd, String name, int age, String addr, String email) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.email = email;
	}

	@Override
	public String toString() {
		return "아이디 = " + id + ", 비밀번호 = " + passwd + ", 이름 = " + name + ", 나이 = " + age + ", 주소 = " + addr
				+ ", 이메일 = " + email;
	}
	
}
