package p01.reference;

public class RefTypeEx1 {
	public static void main(String[] args) {
		//참조변수 p1: 주소값을 가지고 있음
		Point p1 = new Point(10, 20);
//		Point p2 = new Point("10", 20);
		System.out.println(p1.x);
		System.out.println(p1.y);
		System.out.println(p1);
		
		//
		Point p2 = p1;
		System.out.println(p2.x);
		System.out.println(p2.y);
		System.out.println(p2);
	}
}
