package p11.exception;
//UnChecked Exception2
public class Exception22 {
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			int result = 10/num;
			System.out.println(result);
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("String[] args 변수에 값을 넣어 주세요");
		} catch (NumberFormatException e) {
			System.out.println("int 타입에 해당하는 문자열을 넣어 주세요");
		} catch(ArithmeticException e) {
			System.out.println("0 이외의 값을 넣어 주세요");
		}
		System.out.println("Done");
	}
}
