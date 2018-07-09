package p04.string;

public class StringEx1 {
// '==' : 수치 비교에서만 사용
	public static void main(String[] args) {
		String str1 = "spring";
		String str2 = "spring";
		System.out.println(str1);
		System.out.println(str2);
		if (str1 == str2) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		System.out.println("Done");

		System.out.println("=============");
		
		//String이 이미 자바 개발자가 만들어 놓은 클래스이므로 이미 재정의(Override) 되어 있다.
		String str3 = new String("spring");
		String str4 = new String("spring");
		System.out.println(str3);
		System.out.println(str4);
		if (str3 == str4) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		System.out.println("Done");

		System.out.println("=============");
		
		
		//우리가 만든 클래스이므로 두 클래스가 같다라는 재정의(Override)해서 사용
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		System.out.println(p1);
		System.out.println(p2);
		if (p1 == p2) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		System.out.println("Done");
	}
}
