package p02.reference.type;

public class RefTypeMain2 {
	public static void main(String[] args) {
//		CheckingAccount ca = new CheckingAccount("1111", "홍길동", 1000, "11-22");
//		System.out.println(ca.accountNo);
		
//		Account a = new Account("2222", "알파고", 2000);
//		System.out.println(a.accountNo);
		
		//PolyMorphism 다형성
		Account at = new CheckingAccount("1111", "홍길동", 1000, "11-22");
		CheckingAccount ca = (CheckingAccount) at;
		
		try {
			int amount = ca.pay("11=22", 470);
			System.out.println("인출금액: " + amount);
			System.out.println("카드번호: " + ca.cardNo);
			System.out.println(ca.accountNo);
			System.out.println(ca.ownerName);
			System.out.println(ca.balance);
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		
		at.deposit(1200);
		
		//3
		try {
			at.withdraw(5500);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
