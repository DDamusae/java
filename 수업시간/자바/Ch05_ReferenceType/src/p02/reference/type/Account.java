package p02.reference.type;

public class Account {
	String accountNo;
	String ownerName;
	int balance; //잔고
	
	//생성자, 상속 대상x
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	//입금 메소드
	void deposit(int amount) {
		balance += amount;
	}
	
	//지불 메소드
	int withdraw(int amount) throws Exception {
		if(balance < amount)
			throw new Exception();
		balance -= amount;
		return amount;
	}
}
