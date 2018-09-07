package p05.reference.polymorphism;

public class Child extends Parent{
	
	public void check() {
		System.out.println("Successful casting");
	}
	
	//형 변환이 가능한지 여부
	public static void show(Parent p) {
		if(p instanceof Child) {
			Child c = (Child) p; //참조변수의 형변환
			c.check();
		}else {
			System.out.println("false");
		}
	}
}
