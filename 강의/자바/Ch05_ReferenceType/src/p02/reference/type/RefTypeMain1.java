package p02.reference.type;

public class RefTypeMain1 {
	public static void main(String[] args) {
//		CheckingAccount ca = new CheckingAccount("1111", "홍길동", 1000, "11-22");
//		System.out.println(ca.accountNo);
		
//		Account a = new Account("2222", "알파고", 2000);
//		System.out.println(a.accountNo);
		
		//PolyMorphism 다형성
		Account at = new CheckingAccount("1111", "홍길동", 1000, "11-22");
//		int amount = at.pay("11=22", 470);
//		System.out.println("인출금액: " + amount);
//		System.out.println("카드번호: " + at.cardNo);
		System.out.println(at.accountNo);
		System.out.println(at.ownerName);
		System.out.println(at.balance);
		at.deposit(1200);
		
		//3
		try {
			at.withdraw(5500);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
