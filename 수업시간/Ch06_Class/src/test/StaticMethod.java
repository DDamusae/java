package test;

public class StaticMethod {
	//
	int memVar;
	static int staticVar;
	
	void memMethod1() {
		@SuppressWarnings("unused")
		int local = memVar;
		local = staticVar;
		staticMethod1();
		memMethod2();
		System.out.println("memMethod1");
	}
	void memMethod2() {
		System.out.println("memMethod2");
	}
	static void staticMethod1() {
//		int local = memVar;
//		memMethod1();
		StaticMethod st = new StaticMethod();
		@SuppressWarnings("unused")
		int local = st.memVar;
		st.memMethod2();
		staticMethod2();
		System.out.println("staticMethod1");
	}
	static void staticMethod2() {
		System.out.println("staticMethod2");
	}
	
	public static void main(String[] args) {
//		StaticMethod.staticMethod1();
		StaticMethod st = new StaticMethod();
		
		st.memMethod1();
		StaticMethod.staticMethod2();
		staticMethod2();
		@SuppressWarnings("unused")
		int local = staticVar;
		//local = memVar;
	}
}
