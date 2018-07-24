package p04.singleton;

public class Bank {
	String name;
	
	private Bank(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public static Bank getBank() {
		return b;
	}
	
	//다른 클래스에서 객체 생성 불가
	private static Bank b = new Bank("신한은행");
}
