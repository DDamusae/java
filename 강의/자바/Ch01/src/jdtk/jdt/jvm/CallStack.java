package jdtk.jdt.jvm;

public class CallStack {
	//메소드는 스택구조임을 보인다.
	
	//Method: Stack 영역에 저장
	public static void main(String[] args) {
		System.out.println("main() 시작");
		firstMethod();
		System.out.println("main() 끝");
	}
	
	static void firstMethod() {
		System.out.println("firstMethod()가 시작");
		secondMethod();
		System.out.println("firstMethod()가 끝");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()가 시작");
		System.out.println("secondMethod()가 끝");
	}
}
