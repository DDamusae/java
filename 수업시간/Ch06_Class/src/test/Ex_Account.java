package test;

public class Ex_Account {
	//
	String accountNo;
	String ownerName;
	int balance;

	public Ex_Account(String accountNo, String ownerName, int balance) throws Exception {
		if (balance < 0)
			throw new Exception("객체를 생성할 수 없습니다.");
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	void deposit(int amount) {
		balance += amount;
	}

	// throw Exception: 메소드가 발생 익셉션의 종류를 표시하는 throws절
	int withdraw(int amount) throws Exception { // 인출
		if (balance < amount) // 잔액이 요구 금액보다 낮으면 Exception 발생
			throw new Exception("잔액이 부족합니다.");
			// return 0;
			balance -= amount;
		return amount;
	}
}

