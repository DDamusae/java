package P03.initialblock;

public class Good {
	public Good() {
		System.out.println("기본 생성자");
	}
	
	//초기화 블럭
	{
		System.out.println("인스턴스 초기화 블럭");
	}
	
	//스태틱 초기화 블럭
	static {
		System.out.println("스태틱 초기화 블럭");
	}
}
