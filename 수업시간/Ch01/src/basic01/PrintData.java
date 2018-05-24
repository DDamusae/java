package basic01;

public class PrintData {
	
	void printData(int a, int b, int c) {
		//지역 변수
		int tot = a+b+c;
		System.out.println("a+b+c = " + tot);
		
		int hap = MainClass.sum();
		System.out.println(hap);
	}
}
