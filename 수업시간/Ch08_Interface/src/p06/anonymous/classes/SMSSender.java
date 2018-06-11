package p06.anonymous.classes;

public class SMSSender extends MessageSender{
	String phoneNo;
	String responsePhoneNo;
	

	public SMSSender(String phoneNo, String responsePhoneNo) {
		super();
		this.phoneNo = phoneNo;
		this.responsePhoneNo = responsePhoneNo;
	}


	@Override
	void sendMessage(String message) {
		System.out.println("전화 번호: " + phoneNo);
		System.out.println("회신 전화 번호: " + responsePhoneNo);
		System.out.println("메세지 내용: " + message);
	}
}
