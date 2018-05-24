package basic01;

public class MainClass {
	public static void main(String[] args) {
		int a = 3, b = 5;
		Operation op = new Operation();
		int c = op.add(a, b);

		
		PrintData pd = new PrintData();
		pd.printData(a, b, c);
	}
	
	static int sum() {
		System.out.println("sum");
		return 100;
	}
}
