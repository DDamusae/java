package test;

public class NestedClassEx01 {
	public static void main(String[] args) {
		PiggyBank pb1 = new PiggyBank();
		System.out.println("첫 번째 저금통: " + pb1.total);
		PiggyBank pb2 = new PiggyBank();
		pb2.slot.put(100);
		System.out.println("두 번째 저금통: " + pb2.total);
		PiggyBank pb3 = new PiggyBank();
		System.out.println("세 번째 저금통: " + pb3.total);
	}
}
