package test;

class Good{
	
	
	{
		System.out.println("good의 인스턴스 초기화 블록 실행");
	}
	
	static {
		System.out.println("good의 static 초기화 블록 실행");
	}
}

public class InitialBlockTest {
	public static void main(String[] args) {
		Good g1 = new Good();
		Good g2 = new Good();
		Good g3 = new Good();
		System.out.println("main");
	}
}

