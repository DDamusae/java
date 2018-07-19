package dto;

public class Message {
	private int id;
	private String guestName;
	private String password;
	private String message;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	//암호값이 비어있지 않은지 확인하는 메소드
	public boolean hasPassword() {
		return password != null && !password.isEmpty();
	}
	
	//파라미터로 전달받은 pwd가 암호와 일치하는지 확인하는 메소드
	public boolean matchPassword(String pwd) {
		return password != null && password.equals(pwd);
	}
}
