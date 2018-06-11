package test;

import test.PiggyBank.Slot;

public class NestedClassEx02 {
	public static void main(String[] args) {
		PiggyBank bank1 = new PiggyBank();
		PiggyBank bank2 = new PiggyBank();
		
		Slot s = bank1.slot;
		bank1.slot = bank2.slot;
		bank2.slot = s;
		
		bank1.slot.put(10000);
		bank2.slot.put(10);
		
		System.out.println("첫 번째 저금통: " + bank1.total);
		System.out.println("두 번째 저금통: " + bank2.total);
	}
}
