package p11.exception;

public class ExceptionEx2 {
	public static void main(String[] args) {
		//Checked Exception : 예외처리를 하지 않으면, Compile error 발생
		//UnChecked Exception : 실행시 예외처리를 해야 한다.
		
		int sum = 1+-2;
		try {
			//반드시 예외처리를 해야한다(Checked Exception)
			throw new Exception("Checked Exception!!");
		}catch (Exception e) {
			System.out.println("throw로 던진것을  catch로 받음");
		}
		System.out.println(sum);
	}
}
