package p03.ref.instanceofs;

public class InstanceofMain {
	public static void main(String[] args) {
		DicaPhone dp = new DicaPhone("갤럭시", "010-1222-1111", "2048");
		dp.printDicaPhone();
	
		
		if(dp instanceof DicaPhone) {
			System.out.println("1.dp는 DicaPhone이다.");
		}
		
		if(dp instanceof DicaPhone) {
			System.out.println("2.dp는 HandPhone이다.");
			@SuppressWarnings("unused")
			HandPhone hp = dp;
			System.out.println("dp Handphone으로 형변환");
		}
		
		HandPhone hp2 = new HandPhone();
		if(hp2 instanceof DicaPhone) {
			System.out.println("3. hp2는 DicaPhone이다.");
		}
		System.out.println("아니다.");
	}
}

