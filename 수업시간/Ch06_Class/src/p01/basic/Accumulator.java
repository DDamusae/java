package p01.basic;

public class Accumulator {
	int total = 0; //인스턴스 변수
	static int grandTotal = 0; //스태틱 변수 
	
	//인스턴스 메소드 : 메모리에 없기 때문에 인스턴스, 스태틱 변수 모두 사용 가능
	void accumulate(int amount) {
		total += amount; 
		grandTotal += amount;
	}
	
	//스태틱 메소드 : 메모리에 올라와 있기 때문에 인스턴스 변수는 객체 생성 후 사용가능
	static int getGrandTotal() {
		Accumulator a = new Accumulator();
		System.out.println(a.total);
		return grandTotal;
	}
}
