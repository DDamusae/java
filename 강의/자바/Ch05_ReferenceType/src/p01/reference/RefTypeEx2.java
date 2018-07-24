package p01.reference;

public class RefTypeEx2 {
	public static void main(String[] args) {
		Point p1 = new Point(30, 40);
		System.out.println(p1.x);
		System.out.println(p1.y);
		System.out.println(p1);
		
		RefTypeEx2.rearArrange(p1);
		System.out.println(p1.x);
		System.out.println(p1.y);
		System.out.println(p1);
	}
	
	static void rearArrange(Point p) {
		p.x = 50;
		p.y = 60;
		System.out.println(p);
	}
}
