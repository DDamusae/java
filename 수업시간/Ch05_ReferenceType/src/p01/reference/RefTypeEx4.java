package p01.reference;

public class RefTypeEx4 {
	public static void main(String[] args) {
		Point p1 = null; //아무 값도 참조하지 않은 상태
		
		try {
			System.out.println(p1.x);
			System.out.println(p1.y);	
		}catch (Exception e) {
			System.out.println("NullPointer Exception");
		}
	}
}
