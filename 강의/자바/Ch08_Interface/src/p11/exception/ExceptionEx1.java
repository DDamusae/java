package p11.exception;
//UnChecked Exception: 실행시 예외 발생
public class ExceptionEx1 {
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 0;
		
		try {
			int result = num1 / num2;
			System.out.println(result);	
		} catch (Exception e) {
			System.out.println("0으로 나누기 금지");
		}
		
	}
}
