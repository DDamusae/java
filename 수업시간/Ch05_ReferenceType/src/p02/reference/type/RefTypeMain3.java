package p02.reference.type;

public class RefTypeMain3 {
	public static void main(String[] args) {
//		CheckingAccount ca = new CheckingAccount("1111", "홍길동", 1000, "11-22");
//		System.out.println(ca.accountNo);
		
//		Account a = new Account("2222", "알파고", 2000);
//		System.out.println(a.accountNo);
		
		//PolyMorphism 다형성
		Account at = new CheckingAccount("1111", "홍길동", 1000, "11-22");
		CheckingAccount ca = (CheckingAccount) at; //참조 변수의 형변환
		
		if(ca instanceof CheckingAccount)
			pay2(ca);
		else
			System.out.println("형변환(cast)할 수 없는 타입입니다.");
	}
	
//	private static void pay2(Account ca) {
//		try {
//			int amount = ca.pay("11=22", 470);
//			System.out.println("인출금액: " + amount);
//			System.out.println("카드번호: " + ca.cardNo);
//			System.out.println(ca.accountNo);
//			System.out.println(ca.ownerName);
//			System.out.println(ca.balance);
//		} catch (Exception e1) {
//			System.out.println(e1.getMessage());
//		}
//	}
	private static void pay2(CheckingAccount ca) {
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
	}
	
}
