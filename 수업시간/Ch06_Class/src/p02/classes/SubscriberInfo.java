package p02.classes;

public class SubscriberInfo {
	String name, id, password, phoneNo, address;
	
	public SubscriberInfo(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}

	public SubscriberInfo(String name, String id, String password, String phoneNo, String address) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	
}
