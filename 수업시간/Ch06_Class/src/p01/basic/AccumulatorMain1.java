package p01.basic;

public class AccumulatorMain1 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Accumulator a1 = new Accumulator();
		Accumulator a2 = new Accumulator();
		
		a1.accumulate(10);
		a2.accumulate(20);
		int grandTotal = Accumulator.getGrandTotal();
		System.out.println(a1.total);
		System.out.println(a1.getGrandTotal());
		System.out.println();
		System.out.println(a2.total);
		System.out.println(a2.getGrandTotal());
		System.out.println();
		System.out.println(grandTotal);
	}
}
