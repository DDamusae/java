package test;

class Sawon3{
	String name = "홍길동";
	
}
@SuppressWarnings("unused")
class Sales3 extends Sawon3{
	String name = "샤이니";

	String displayInfoLocal() {
		String name = "이정";
		return name;
	}
	String displayInfoThis() {
		String name = "이정";
		return this.name;
	}
	String displayInfoSuper() {
		String name = "이정";
		return super.name;
	}
}

public class SuperVariableTest {
	public static void main(String[] args) {
		Sales3 s = new Sales3();
		System.out.println("local.name = " + s.displayInfoLocal());
		System.out.println("this.name = " + s.displayInfoThis());
		System.out.println("super.name = " + s.displayInfoSuper());
	}
}
