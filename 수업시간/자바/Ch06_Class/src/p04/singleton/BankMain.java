package p04.singleton;

public class BankMain {
	public static void main(String[] args) {
		Bank b = Bank.getBank();
		System.out.println("Bank의 이름은: " + b.getName());
	}
}
