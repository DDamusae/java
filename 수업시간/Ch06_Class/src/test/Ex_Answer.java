package test;

public class Ex_Answer {
	public static void main(String[] args) {
		//
		try {
			Ex_Account obj1 = new Ex_Account("777-777-7777", "연놀부", 10000000);
			System.out.println(obj1.balance);
			Ex_Account obj2 = new Ex_Account("000-000-000000", "연흥부", -100000);
			System.out.println(obj2.balance);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}