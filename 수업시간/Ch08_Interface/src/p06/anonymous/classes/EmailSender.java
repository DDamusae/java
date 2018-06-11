package p06.anonymous.classes;

public class EmailSender extends MessageSender {
	String sender;
	String reciever;
	

	public EmailSender(String sender, String reciever) {
		super();
		this.sender = sender;
		this.reciever = reciever;
	}

	
	@Override
	void sendMessage(String message) {
		System.out.println("------------------------------");
		System.out.println("보내는 사람: " + sender);
		System.out.println("받는 사람: " + reciever);
		System.out.println("내용: " + message);
	}

}
